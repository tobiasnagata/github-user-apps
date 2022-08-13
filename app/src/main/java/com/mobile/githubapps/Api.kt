package com.mobile.githubapps

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}