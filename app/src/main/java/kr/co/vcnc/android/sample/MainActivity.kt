package kr.co.vcnc.android.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kr.co.vcnc.android.sample.api.GithubService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: apply dagger
        // TODO: Below codes are just for Simple Test
        val mapper = ObjectMapper()
        mapper.registerModule(KotlinModule())
        mapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

        val httpClient = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .addInterceptor { chain: Interceptor.Chain ->
                    val request = chain.request()
                            .newBuilder()
                            .header("Authorization", "token ${BuildConfig.GITHUB_ACCESS_TOKEN}")
                            .header("User-Agent", packageName)
                            .build()
                    chain.proceed(request)
                }
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .client(httpClient)
                .build()

        Single.fromCallable {
            retrofit.create(GithubService::class.java)
                    .searchRepositories("topic:android", 0, 32)
                    .execute()
                    .body()
        }.subscribeOn(Schedulers.io())
                .subscribe({ searchResult ->
                    Log.d("fuck", searchResult?.toString())
                })
    }
}