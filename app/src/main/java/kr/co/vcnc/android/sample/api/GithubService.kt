package kr.co.vcnc.android.sample.api

import io.reactivex.Single
import kr.co.vcnc.android.sample.model.GithubRepositorySearchResult
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("/search/repositories")
    fun searchRepositories(@Query(value = "q", encoded = true) query: String,
                           @Query("page") page: Int,
                           @Query("per_page") perPage: Int): Single<GithubRepositorySearchResult>
}