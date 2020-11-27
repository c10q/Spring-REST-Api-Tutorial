package com.example.blog


class User(id: Long, name: String) {
    private val userId = id
    private val userName = name

    fun getId(): Long {
        return userId
    }

    fun getName(): String {
        return userName
    }
}