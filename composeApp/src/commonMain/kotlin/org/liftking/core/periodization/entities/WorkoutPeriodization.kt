package org.liftking.core.periodization.entities

import kotlinx.datetime.LocalDate

data class WorkoutPeriodization(
    val id: Int,
    var description: String,
    var startsOn: LocalDate,
    var finishOn: LocalDate?,
    var workouts: List<Int>?,
    var isDeleted: Boolean
)