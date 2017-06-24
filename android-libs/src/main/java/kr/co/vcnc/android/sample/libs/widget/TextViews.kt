package kr.co.vcnc.android.sample.libs.widget

import android.graphics.Typeface
import android.os.Handler
import android.support.annotation.ArrayRes
import android.support.v4.provider.FontRequest
import android.support.v4.provider.FontsContractCompat
import android.widget.TextView

object TextViews {
    fun setDownloadableFonts(textView: TextView, fontFamily: String, handler: Handler, @ArrayRes certificates: Int) {
        val fontRequest = FontRequest("com.google.android.gms.fonts", "com.google.android.gms", fontFamily, certificates)
        FontsContractCompat.requestFont(textView.context, fontRequest, object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                super.onTypefaceRetrieved(typeface)
                textView.typeface = typeface
            }
        }, handler)
    }
}