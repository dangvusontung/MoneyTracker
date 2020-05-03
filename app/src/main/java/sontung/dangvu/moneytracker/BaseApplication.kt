package sontung.dangvu.moneytracker

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import sontung.dangvu.moneytracker.di.DaggerAppComponent

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerAppComponent.builder().application(this).build()
    }

}