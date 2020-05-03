package sontung.dangvu.moneytracker.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import sontung.dangvu.moneytracker.di.annotation.ViewModelKey
import sontung.dangvu.moneytracker.ui.list.MoneyViewModel

@Module
abstract class MoneyViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MoneyViewModel::class)
    abstract fun bindMoneyViewModel(moneyViewModel: MoneyViewModel) : ViewModel

}