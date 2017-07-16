package kr.co.vcnc.android.sample.feature.repository

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kr.co.vcnc.android.sample.api.GithubService
import javax.inject.Inject

class RepositoryListViewModel @Inject constructor() {
    @Inject lateinit var githubService: GithubService

    val adapter = RepositoryListAdapter()

    // TODO: loadMore
    fun loadRepositories() {
        githubService
                .searchRepositories("topic:android", 0, 32)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ searchResult ->
                    adapter.repositories = searchResult.items
                }, { throwable ->
                    // TODO: logger
                })
    }
}