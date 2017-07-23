package kr.co.vcnc.android.sample.feature.repository

import com.trello.rxlifecycle2.RxLifecycle
import com.trello.rxlifecycle2.android.ActivityEvent
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import kr.co.vcnc.android.sample.api.GithubService
import kr.co.vcnc.android.sample.database.DatabaseObservables
import kr.co.vcnc.android.sample.database.DatabaseType
import kr.co.vcnc.android.sample.database.GreenSession
import kr.co.vcnc.android.sample.model.DaoSession
import kr.co.vcnc.android.sample.model.GithubRepository
import javax.inject.Inject

class RepositoryListViewModel @Inject constructor() {
    @Inject lateinit var lifecycle: Observable<ActivityEvent>
    @Inject lateinit var databaseObservables: DatabaseObservables
    @Inject lateinit var greenSession: GreenSession
    @Inject lateinit var repositoryStorage: RepositoryStorage
    @Inject lateinit var githubService: GithubService


    val adapter = RepositoryListAdapter()

    fun subscribeDatabase() {
        databaseObservables.repositoryChanges()
                .compose(RxLifecycle.bindUntilEvent(lifecycle, ActivityEvent.DESTROY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ nothing ->
                    val repositories = greenSession.query(Function<DaoSession, ArrayList<GithubRepository>> { daoSession -> repositoryStorage.getAllRepositories(daoSession) })
                    adapter.repositories = repositories ?: ArrayList()
                }, { throwable ->
                    // TODO: logger
                })
    }

    // TODO: loadMore
    fun loadRepositories() {
        githubService
                .searchRepositories("topic:android", 0, 32)
                .compose(RxLifecycle.bindUntilEvent(lifecycle, ActivityEvent.DESTROY))
                .subscribeOn(Schedulers.io())
                .subscribe({ searchResult ->
                    greenSession.transaction(Consumer { daoSession -> repositoryStorage.upsertRepositories(daoSession, searchResult.items) }, DatabaseType.REPOSITORY)
                }, { throwable ->
                    // TODO: logger
                })
    }
}