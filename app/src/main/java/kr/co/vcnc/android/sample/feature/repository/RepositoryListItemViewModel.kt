package kr.co.vcnc.android.sample.feature.repository

import android.view.View
import kr.co.vcnc.android.sample.model.GithubRepository

class RepositoryListItemViewModel(val repository: GithubRepository) {
    fun onClick(v: View) {
        v.context.startActivity(RepositoryDetailActivity.intents(v.context, repository))
    }
}
