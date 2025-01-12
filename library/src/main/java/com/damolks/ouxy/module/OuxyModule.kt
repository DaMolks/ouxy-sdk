package com.damolks.ouxy.module

import android.view.View

interface OuxyModule {
    fun initialize(context: ModuleContext)
    fun getMainView(): View
    fun cleanup()
}