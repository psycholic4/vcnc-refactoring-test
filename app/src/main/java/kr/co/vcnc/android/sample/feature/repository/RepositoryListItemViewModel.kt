package kr.co.vcnc.android.sample.feature.repository

import android.graphics.Typeface
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.StyleSpan
import kr.co.vcnc.android.sample.model.GithubRepository

class RepositoryListItemViewModel(val repository: GithubRepository) {
    fun getName(): CharSequence {
        val name = SpannableString(repository.name)
        name.setSpan(StyleSpan(Typeface.BOLD), 0, name.length, 0)
        return TextUtils.concat(repository.owner.login, " / ", name)
    }
}
