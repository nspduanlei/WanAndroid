package com.dl.android.wanandroid.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dl.android.wanandroid.data.bean.Component

/**
 * @time: 2020/5/15
 * @author: marsLei
 */

@Dao
interface HomeDao {
    @Query("SELECT * FROM component ORDER BY id")
    fun getComponents(): LiveData<List<Component>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(plants: List<Component>)
}