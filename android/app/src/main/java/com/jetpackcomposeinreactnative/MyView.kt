package com.jetpackcomposeinreactnative

import android.content.Context
import android.widget.LinearLayout
import androidx.compose.ui.platform.ComposeView

class MyView(context: Context): LinearLayout(context) {
    private val composeView: ComposeView = ComposeView(context)

    init {
        composeView.setContent {
            MyComposeView()
        }
        addView(composeView)
    }
}