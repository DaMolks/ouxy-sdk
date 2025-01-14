package com.damolks.ouxy.module

interface StorageApi {
    suspend fun readText(filename: String): String
    suspend fun writeText(filename: String, content: String)
    suspend fun delete(filename: String)
    suspend fun exists(filename: String): Boolean
    suspend fun list(): List<String>
}