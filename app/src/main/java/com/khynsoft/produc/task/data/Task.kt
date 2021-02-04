package com.khynsoft.produc.task.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
@kotlinx.parcelize.Parcelize
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String
) : Parcelable
