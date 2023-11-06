package com.divyank.lifecycleaware

import android.util.Log
import androidx.constraintlayout.helper.widget.MotionEffect.TAG
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer :LifecycleObserver{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun oncreate(){
        Log.d(TAG,"observer lifcycle called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ondestroy(){
        Log.d(TAG,"Destroy from observer called")
    }

}


// create/onstart/onresume/onrestart me pehle activity k methods call hoge  // destruction/onstop/onpause me pehle observer k methods call hoge // khatam hone se pehle sare kaam nipta lo -- observer ko bata do