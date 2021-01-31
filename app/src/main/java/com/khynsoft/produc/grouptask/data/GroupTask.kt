package com.khynsoft.produc.grouptask.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "group_task_table")
@kotlinx.parcelize.Parcelize
data class GroupTask(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String
) : Parcelable
