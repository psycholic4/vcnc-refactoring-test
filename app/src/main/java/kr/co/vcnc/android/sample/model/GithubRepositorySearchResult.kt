package kr.co.vcnc.android.sample.model

data class GithubRepositorySearchResult(
        val totalCount: Long,
        val incompleteResults: Boolean,
        val items: List<GithubRepository>
)