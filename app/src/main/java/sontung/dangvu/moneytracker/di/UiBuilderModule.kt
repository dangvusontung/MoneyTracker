package sontung.dangvu.moneytracker.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sontung.dangvu.moneytracker.MainActivity

@Module
abstract class UiBuilderModule {

    @ContributesAndroidInjector (
        modules = [
            FragmentModule::class,
            MoneyViewModelModule::class
        ]
    )
    abstract fun contributeMainActivity() : MainActivity

}