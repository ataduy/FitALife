package com.example.fitalife.data

data class UserData(
    val userId: String? = null,
    val username: String? = null,
    val usertype: String? = "member",
    val gender: String? = null,
    val age: String? = null,
    val weight: String? = null,
    val height: String? = null,
    val workouts: List<String>? = null,
    val trainer: String? = null,
) {
    fun toMap() = mapOf(
        "userId" to userId,
        "username" to username,
        "usertype" to usertype,
        "gender" to gender,
        "age" to age,
        "weight" to weight,
        "height" to height,
        "workouts" to workouts,
        "trainer" to trainer
    )
}