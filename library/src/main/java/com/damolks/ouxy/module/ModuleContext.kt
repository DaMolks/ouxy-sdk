package com.damolks.ouxy.module

import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope

interface ModuleContext {
    fun context(): Context 
    val lifecycleScope: LifecycleCoroutineScope
    val lifecycle: Lifecycle
    val storage: StorageApi
}