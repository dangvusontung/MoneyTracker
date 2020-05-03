package sontung.dangvu.moneytracker.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sontung.dangvu.moneytracker.MainActivity
import sontung.dangvu.moneytracker.ui.list.MoneyViewModel

@Module
abstract class UiBuilderModule {

    @ContributesAndroidInjector (
        modules = [
            ListFragmentModule::class,
            MoneyViewModelModule::class
        ]
    )
    abstract fun contributeMainActivity() : MainActivity


}