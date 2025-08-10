package org.liftking.core.exercise.data.databases

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_database.db")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    var description: String,
    )
