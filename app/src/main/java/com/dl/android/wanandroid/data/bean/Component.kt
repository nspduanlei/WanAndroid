package com.dl.android.wanandroid.data.bean

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
@Entity(tableName = "component")
data class Component(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    val title: String,
    val description: String,
    val link: String
) : Serializable {
    override fun toString() = title
}
