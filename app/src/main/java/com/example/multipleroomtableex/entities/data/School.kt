package com.example.multipleroomtableex.entities.data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School(
    @PrimaryKey(autoGenerate = false)
    //String veri olduğu için autogenerateye ihtiyacımız yok.
    val schoolName: String

)