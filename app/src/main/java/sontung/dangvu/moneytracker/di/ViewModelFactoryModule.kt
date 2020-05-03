package sontung.dangvu.moneytracker.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import sontung.dangvu.moneytracker.utils.ViewModelFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory

}