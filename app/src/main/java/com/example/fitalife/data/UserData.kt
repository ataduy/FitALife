package com.example.fitalife.data

data class UserData(
    val userId: String? = null,
    val username: String? = null,
    val name: String? = null,
    val surname: String? = null,
    val usertype: String? = "member",
    val gender: String? = null,
    val age: String? = null,
    val weight: String? = null,
    val height: String? = null,
) {
    fun toMap() = mapOf(
        "userId" to userId,
        "username" to username,
        "name" to name,
        "surname" to surname,
        "usertype" to usertype,
        "gender" to gender,
        "age" to age,
        "weight" to weight,
        "height" to height,
    )
}