package com.jetpackcomposeinreactnative

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class MyViewPackage : ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): List<NativeModule> {
        return emptyList()
    }

    override fun createViewManagers(context: ReactApplicationContext) =
        listOf(MyViewManager(context))
}