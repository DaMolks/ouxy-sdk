package com.damolks.ouxy.module

/**
 * API de stockage pour les modules.
 */
interface StorageApi {
    /**
     * Sauvegarde une donnée.
     */
    suspend fun <T> save(key: String, value: T)

    /**
     * Récupère une donnée.
     */
    suspend fun <T> get(key: String, defaultValue: T): T

    /**
     * Supprime une donnée.
     */
    suspend fun remove(key: String)

    /**
     * Efface toutes les données.
     */
    suspend fun clear()
}