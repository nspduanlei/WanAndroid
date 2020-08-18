package com.dl.android.wanandroid.data.net

import android.telecom.Call
import com.dl.android.wanandroid.data.bean.GankResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
interface Api {

    @GET("data/Android/{count}/{page}")
    fun getGank(
        @Path("count") count: Int,
        @Path("page") page: Int
    ): Call

}