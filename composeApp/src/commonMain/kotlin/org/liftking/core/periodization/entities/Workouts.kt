package org.liftking.core.periodization.entities


data class Workouts(
    val id: Int,
    var description: String,
    var exercises: List<Int>?,
    var isDeleted: Boolean
)
