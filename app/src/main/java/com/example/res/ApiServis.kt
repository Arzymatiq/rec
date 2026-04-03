package com.example.res
import retrofit2.Call
import retrofit2.http.GET

interface ApiServis {
    @GET("/api/sport")
    fun getPost():Call<List<Post>>
}