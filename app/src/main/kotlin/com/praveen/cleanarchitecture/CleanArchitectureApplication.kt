package com.praveen.cleanarchitecture

import android.app.Application
import com.praveen.cleanarchitecture.di.PresentationModule
import com.praveen.cleanarchitecture.di.dataModule
import com.praveen.cleanarchitecture.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CleanArchitectureApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = listOf(
            PresentationModule,
            domainModule,
            dataModule
        )

        startKoin {
            androidContext(this@CleanArchitectureApplication)
            modules(appModules)
        }
    }
}