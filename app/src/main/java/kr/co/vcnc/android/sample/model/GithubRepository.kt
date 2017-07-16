package kr.co.vcnc.android.sample.model

import android.graphics.Typeface
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.StyleSpan

data class GithubRepository(
        val id: Long,
        val name: String,
        val fullName: String,
        val owner: GithubUser,
        val private: Boolean,
        val htmlUrl: String?,
        val description: String?,
        val fork: Boolean,
        val url: String?,
        val forksUrl: String?,
        val keysUrl: String?,
        val collaboratorsUrl: String?,
        val teamsUrl: String?,
        val hooksUrl: String?,
        val issueEventsUrl: String?,
        val eventsUrl: String?,
        val assigneesUrl: String?,
        val branchesUrl: String?,
        val tagsUrl: String?,
        val blobsUrl: String?,
        val gitTagsUrl: String?,
        val gitRefsUrl: String?,
        val treesUrl: String?,
        val statusesUrl: String?,
        val languagesUrl: String?,
        val stargazersUrl: String?,
        val contributorsUrl: String?,
        val subscribersUrl: String?,
        val subscriptionUrl: String?,
        val commitsUrl: String?,
        val gitCommitsUrl: String?,
        val commentsUrl: String?,
        val issueCommentUrl: String?,
        val contentsUrl: String?,
        val compareUrl: String?,
        val mergesUrl: String?,
        val archiveUrl: String?,
        val downloadsUrl: String?,
        val issuesUrl: String?,
        val pullsUrl: String?,
        val milestonesUrl: String?,
        val notificationsUrl: String?,
        val labelsUrl: String?,
        val releasesUrl: String?,
        val deploymentsUrl: String?,
        val createdAt: String, // TODO: how to convert datetime?
        val updatedAt: String, // TODO: how to convert datetime?
        val pushedAt: String, // TODO: how to convert datetime?
        val gitUrl: String?,
        val sshUrl: String?,
        val cloneUrl: String?,
        val svnUrl: String?,
        val homepage: String?,
        val size: Long,
        val stargazersCount: Long,
        val watchersCount: Long,
        val language: String?,
        val hasIssues: Boolean,
        val hasProjects: Boolean,
        val hasDownloads: Boolean,
        val hasWiki: Boolean,
        val hasPages: Boolean,
        val forksCount: Long,
        val mirrorUrl: Boolean,
        val openIssuesCount: Long,
        val forks: Long,
        val openIssues: Long,
        val watchers: Long,
        val defaultBranch: String?,
        val score: Double
) {
    fun getNameSpan(): CharSequence {
        val name = SpannableString(name)
        name.setSpan(StyleSpan(Typeface.BOLD), 0, name.length, 0)
        return TextUtils.concat(owner.login, " / ", name)
    }
}