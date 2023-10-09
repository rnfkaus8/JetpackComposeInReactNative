package com.jetpackcomposeinreactnative

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate

class MyViewManager(private val context: ReactApplicationContext) : SimpleViewManager<MyView>() {
    override fun createViewInstance(context: ThemedReactContext): MyView {
        return MyView(context)
    }

    override fun getName(): String = "MyView"
}