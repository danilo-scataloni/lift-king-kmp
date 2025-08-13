package org.liftking.app.database

import android.content.Context
import androidx.room.Room
import org.liftking.core.exercise.data.databases.ExerciseDatabase

fun getExerciseDatabase(context: Context): ExerciseDatabase{
    val dbFile = context.getDatabasePath("exercises")
    return Room.databaseBuilder(
        context = context.applicationContext,
        klass = ExerciseDatabase::class.java,
        dbFile.absolutePath
    ).build()
}