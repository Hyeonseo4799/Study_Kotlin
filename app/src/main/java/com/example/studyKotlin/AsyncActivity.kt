package com.example.studyKotlin

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_async.*

class AsyncActivity : AppCompatActivity() {
    var task: BackgroundAsyncTask? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)


        start.setOnClickListener {
            task = BackgroundAsyncTask(progressbar, ment)
            task?.execute()
        }

        stop.setOnClickListener {
            task?.cancel(true)
        }
    }

    // Activity가 종료되도 Async가 같이 종료되지 않으므로 life cycle을 이용한다
    override fun onPause() {
        task?.cancel(true)
        super.onPause()
    }
}

class BackgroundAsyncTask(
    private val progressbar: ProgressBar,
    private val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    // params -> doInBackground 에서 사용할 타입
    // progress -> onProgressUpdate 에서 사용할 타입
    // result -> onPostExecute 에서 사용할 타입
    var percent: Int = 0
    override fun onPreExecute() {
        percent = 0
        progressbar.progress = percent
    }

    override fun doInBackground(vararg p0: Int?): Int {
        while (!isCancelled) {
            percent++
            Log.d("async", "value : $percent")
            if (percent > 100)
                break
            else
                publishProgress(percent)
            try {
                Thread.sleep(100)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return percent
    }

    override fun onProgressUpdate(vararg values: Int?) {
        progressbar.progress = values[0] ?: 0
        progressText.text = "퍼센트 : ${values[0]}"
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Int?) {
        progressText.text = "작업이 완료되었습니다."

    }

    override fun onCancelled() {
        progressbar.progress = 0
        progressText.text = "작업이 취소되었습니다."
    }
}