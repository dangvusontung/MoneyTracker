package sontung.dangvu.moneytracker.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sontung.dangvu.moneytracker.DetailFragment
import sontung.dangvu.moneytracker.ui.list.ListFragment

@Module
abstract class ListFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeListFragment() : ListFragment

    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailFragment
}