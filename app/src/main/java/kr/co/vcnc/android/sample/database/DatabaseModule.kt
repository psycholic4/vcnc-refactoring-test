package kr.co.vcnc.android.sample.database

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabaseObservables(): DatabaseObservables = DatabaseObservables()

    @Provides
    @Singleton
    fun provideGreenSession(context: Context, databaseObservables: DatabaseObservables): GreenSession
            = GreenSession(context, GreenDaoOpenHelper(context, "github").writableDb, databaseObservables)
}