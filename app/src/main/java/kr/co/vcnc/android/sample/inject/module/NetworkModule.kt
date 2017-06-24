package kr.co.vcnc.android.sample.inject.module

import android.content.Context
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.module.kotlin.KotlinModule
import dagger.Module
import dagger.Provides
import kr.co.vcnc.android.sample.BuildConfig
import kr.co.vcnc.android.sample.api.GithubService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    @Provides
    @Singleton
    @Named(SERVER_GITHUB)
    fun provideGithubRetrofit(context: Context): Retrofit {
        // TODO: choose json library
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
                            .header("User-Agent", context.packageName)
                            .build()
                    chain.proceed(request)
                }
                .build()

        return Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(JacksonConverterFactory.create(mapper))
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
