package br.com.heiderlopes.pokermao

import android.app.Application
import br.com.heiderlopes.pokermao.di.networkModule
import br.com.heiderlopes.pokermao.di.repositoryModule
import br.com.heiderlopes.pokermao.di.viewModelModule
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Stetho.initializeWithDefaults(this)

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }

}