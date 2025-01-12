package com.damolks.ouxy.module

import android.content.Context
import androidx.lifecycle.LifecycleCoroutineScope

interface ModuleContext {
    fun getContext(): Context
    val lifecycleScope: LifecycleCoroutineScope
    val storage: StorageApi
}