package com.divyank.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.helper.widget.MotionEffect.TAG
import androidx.lifecycle.LifecycleObserver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MAIN"," on create called from activity")
        lifecycle.addObserver(Observer())
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Activity On start called")

    }
    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity On pause called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity On Resume called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MAIN","Activity On restart called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN","Activity On destroy called")

    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG,"Activity OnStop called")

    }

    override fun finish() {
        super.finish()
        Log.d(TAG,"activity Finished")
    }

}