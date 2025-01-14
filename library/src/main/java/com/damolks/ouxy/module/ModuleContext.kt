package com.damolks.ouxy.module

import android.content.Context
import androidx.lifecycle.LifecycleCoroutineScope

interface ModuleContext {
    val applicationContext: Context
    val lifecycleScope: LifecycleCoroutineScope
    val storage: StorageApi
    
    fun hasPermission(permission: String): Boolean
    suspend fun requestPermission(permission: String): Boolean
    
    fun sendEvent(name: String, data: Map<String, Any>)
    fun registerEventHandler(name: String, handler: (Map<String, Any>) -> Unit)
}