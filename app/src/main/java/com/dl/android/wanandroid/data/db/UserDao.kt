package com.dl.android.wanandroid.data.db

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.dl.android.wanandroid.data.bean.User

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
@Dao
interface UserDao {

    @Query("SELECT * FROM User ORDER BY name COLLATE NOCASE ASC")
    fun queryUsersByName(): DataSource.Factory<Int, User>

    @Insert
    fun insert(users: List<User>)

    @Insert
    fun insert(user: User)

    @Delete
    fun delete(user: User)

}