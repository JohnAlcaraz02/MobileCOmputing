package com.example.mobilecomputing.models

data class User(
    val userId: String = "",
    val fullName: String = "",
    val email: String = "",
    val registeredAt: Long = System.currentTimeMillis()
)
