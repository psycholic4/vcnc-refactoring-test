package kr.co.vcnc.android.sample.feature.repository

import kr.co.vcnc.android.sample.model.*
import javax.inject.Inject

class RepositoryStorage @Inject constructor() {

    fun getAllRepositories(daoSession: DaoSession): ArrayList<GithubRepository> {
        return ArrayList(daoSession.githubRepositoryTableDao
                .queryBuilder()
                .orderDesc(GithubRepositoryTableDao.Properties.StargazersCount)
                .build()
                .list()
                .map(GithubRepositoryTable::toModel))
    }

    fun upsertRepositories(daoSession: DaoSession, repositories: ArrayList<GithubRepository>) {
        repositories.forEach {
            val table = GithubRepositoryTable.create(it)
            daoSession.insertOrReplace(table)
            daoSession.insertOrReplace(GithubUserTable.create(it.owner))
        }
    }
}