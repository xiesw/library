package com.welab.library.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.welab.library.welablog.WelabLog
import com.welab.library.welablog.WelabLogConfig

class LogDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_demo)

        findViewById<Button>(R.id.button).setOnClickListener({
            WelabLog.v("xsw")
        })
    }
}