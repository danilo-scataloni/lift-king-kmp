package org.liftking.core.exercise.data.databases

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseDao {

    @Query("SELECT * FROM `exercise_database.db`")
    fun getAllExercises(): Flow<List<ExerciseEntity>>

    @Upsert
    suspend fun upsertExercise(exercise: ExerciseEntity)

    @Delete
    suspend fun deleteExercise(exercise: ExerciseEntity)

    @Query("SELECT * FROM `exercise_database.db` WHERE id = :id")
    suspend fun getExerciseById(id: Int): ExerciseEntity?
}