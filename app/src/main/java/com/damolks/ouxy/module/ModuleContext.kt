package com.damolks.ouxy.module

import android.content.Context

/**
 * Contexte fourni aux modules.
 */
interface ModuleContext {
    /**
     * Contexte Android de l'application.
     */
    val applicationContext: Context

    /**
     * API de stockage pour les données du module.
     */
    val storage: StorageApi

    /**
     * Vérifie si une permission est accordée.
     */
    fun hasPermission(permission: String): Boolean

    /**
     * Demande une permission.
     */
    suspend fun requestPermission(permission: String): Boolean
}