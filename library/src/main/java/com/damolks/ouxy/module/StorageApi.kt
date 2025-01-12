package com.damolks.ouxy.module

interface StorageApi {
    suspend fun writeText(path: String, content: String)
    suspend fun readText(path: String): String
    suspend fun exists(path: String): Boolean
    suspend fun delete(path: String)
}