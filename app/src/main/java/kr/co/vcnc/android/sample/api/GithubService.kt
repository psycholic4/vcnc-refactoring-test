package kr.co.vcnc.android.sample.api

import io.reactivex.Single
import kr.co.vcnc.android.sample.model.GithubRepositorySearchResult
import kr.co.vcnc.android.sample.model.GithubTree
import kr.co.vcnc.android.sample.model.GithubTreeQueryResult
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface GithubService {
    @GET("/search/repositories")
    fun searchRepositories(@Query(value = "q", encoded = true) query: String,
                           @Query("page") page: Int,
                           @Query("per_page") perPage: Int): Single<GithubRepositorySearchResult>

    @GET
    fun listTree(@Url url: String): Single<GithubTreeQueryResult>
}