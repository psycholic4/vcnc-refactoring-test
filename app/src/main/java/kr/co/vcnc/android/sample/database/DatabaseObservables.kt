package kr.co.vcnc.android.sample.database

import io.reactivex.BackpressureOverflowStrategy
import io.reactivex.Flowable
import io.reactivex.processors.PublishProcessor


class DatabaseObservables {
    private val NOTIFY_BUFFER_SIZE = 32L

    private val subject = PublishProcessor.create<DatabaseType>()

    fun notify(vararg databaseTypes: DatabaseType) {
        for (databaseType in databaseTypes) {
            subject.onNext(databaseType)
        }
    }

    fun repositoryChanges(): Flowable<DatabaseType> {
        return subject
                .startWith(DatabaseType.REPOSITORY)
                .filter({ it -> it == DatabaseType.REPOSITORY })
                .onBackpressureBuffer(NOTIFY_BUFFER_SIZE, { }, BackpressureOverflowStrategy.DROP_OLDEST)
    }
}