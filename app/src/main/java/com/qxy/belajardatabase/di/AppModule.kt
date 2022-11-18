package com.qxy.belajardatabase.di

import android.content.Context
import androidx.room.Room
import com.qxy.belajardatabase.data.database.MyAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMyDatabase(
        @ApplicationContext context: Context,
    ) = Room.databaseBuilder(
        context,
        MyAppDatabase::class.java,
        "database"
    )
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideNewsDao(database: MyAppDatabase) = database.newsDao()
}