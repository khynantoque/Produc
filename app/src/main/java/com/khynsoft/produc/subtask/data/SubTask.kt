package com.khynsoft.produc.subtask.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sub_task_table")
data class SubTask(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val isCompleted: Boolean = false,
    val groupId: Int = 0
) {
}