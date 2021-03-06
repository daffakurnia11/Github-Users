package me.daffakurnia.android.githubusers.api

import me.daffakurnia.android.githubusers.response.UserDetailResponse
import me.daffakurnia.android.githubusers.response.UserFollowersResponse
import me.daffakurnia.android.githubusers.response.UserFollowingResponse
import me.daffakurnia.android.githubusers.response.UserSearchResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: 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")
    fun getAccount(
        @Query("q") id: String
    ): Call<UserSearchResponse>

    @GET("users/{username}")
    @Headers("Authorization: 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")
    fun getDetail(
        @Path("username") username: String
    ): Call<UserDetailResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<List<UserFollowersResponse>>

    @GET("users/{username}/following")
    @Headers("Authorization: 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<List<UserFollowingResponse>>
}