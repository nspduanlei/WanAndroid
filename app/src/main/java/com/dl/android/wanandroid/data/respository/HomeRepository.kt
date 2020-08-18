package com.dl.android.wanandroid.data.respository

import com.dl.android.wanandroid.data.db.HomeDao

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
class HomeRepository private constructor(private val homeDao: HomeDao) {
    fun getPlants() = homeDao.getComponents()

    //单例模式
    companion object {
        @Volatile private var instance: HomeRepository ?= null
        fun getIntance(plantDao: HomeDao) {
            instance ?: synchronized(this) {
                instance
                    ?: HomeRepository(plantDao).also { instance = it }
            }
        }
    }
}