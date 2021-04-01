package com.demo.myfirstapp.network

import com.demo.myfirstapp.RecyclerList
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("d70abc5f")
    fun getDataFromAPI(): Call<RecyclerList>

}