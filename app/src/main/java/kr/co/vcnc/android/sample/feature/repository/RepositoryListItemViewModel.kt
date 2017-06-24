package kr.co.vcnc.android.sample.feature.repository

import android.databinding.BindingAdapter
import android.graphics.Typeface
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.StyleSpan
import android.widget.TextView
import kr.co.vcnc.android.sample.model.GithubRepository

class RepositoryListItemViewModel(val repository: GithubRepository)

@BindingAdapter("name")
fun setName(textView: TextView, repository: GithubRepository?) {
    if (repository == null) {
        textView.text = ""
        return
    }

    val name = SpannableString(repository.name)
    name.setSpan(StyleSpan(Typeface.BOLD), 0, name.length, 0)
    textView.text = TextUtils.concat(repository.owner.login, " / ", name)
}