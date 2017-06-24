package kr.co.vcnc.android.sample.extentions.widget

import android.widget.TextView
import kr.co.vcnc.android.sample.MyApplication
import kr.co.vcnc.android.sample.R
import kr.co.vcnc.android.sample.libs.widget.TextViews

fun TextView.setDownloadableFonts(fontFamily: String) {
    TextViews.setDownloadableFonts(this, fontFamily, MyApplication.fontsHandler, R.array.com_google_android_gms_fonts_certs)
}
