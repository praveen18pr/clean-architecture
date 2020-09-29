package com.praveen.cleanarchitecture

import android.app.Application
import com.praveen.cleanarchitecture.di.PresentationModule
import com.praveen.cleanarchitecture.di.dataModule
import com.praveen.cleanarchitecture.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class CleanArchitectureApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val modules = module {
            PresentationModule
            domainModule
            dataModule
        }

        startKoin {
            androidContext(this@CleanArchitectureApplication)
            modules(modules)
        }
    }
}