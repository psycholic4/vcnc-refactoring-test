package kr.co.vcnc.android.sample.inject.module

import android.content.Context
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import kr.co.vcnc.android.sample.BuildConfig
import kr.co.vcnc.android.sample.api.GithubService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(context: Context): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .addInterceptor { chain: Interceptor.Chain ->
                    val request = chain.request()
                            .newBuilder()
                            .header("Authorization", "token ${BuildConfig.GITHUB_ACCESS_TOKEN}")
                            .header("User-Agent", context.packageName)
                            .build()
                    chain.proceed(request)
                }
                .build()
    }

    @Provides
    @Singleton
    @Named(SERVER_GITHUB)
    fun provideGithubRetrofit(gson: Gson, httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient)
                .build()
    }

    @Provides
    @Singleton
    fun provideGithubService(@Named(SERVER_GITHUB) retrofit: Retrofit): GithubService {
        return retrofit.create(GithubService::class.java)
    }
}

private const val SERVER_GITHUB = "github"
