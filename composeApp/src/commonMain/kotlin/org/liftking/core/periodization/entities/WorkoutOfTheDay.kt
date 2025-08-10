package org.liftking.core.periodization.entities

import kotlinx.datetime.LocalDate
import org.liftking.core.exercise.entities.Exercise

data class WorkoutOfTheDay(
    val id: Int,
    var dateOfTheWorkout: LocalDate,
    var exercise: Exercise,
    var weight: Int,
    var reps: Int,
    var repsInReserve: Int,
    var isDeleted: Boolean
)
