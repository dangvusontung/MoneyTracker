package sontung.dangvu.moneytracker.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import sontung.dangvu.moneytracker.db.AppDatabase
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyRepository
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyTransactionDao
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "money_db").build()
    }

    @Provides
    fun provideMoneyDao(database: AppDatabase): MoneyTransactionDao {
        return database.moneyDao()
    }

    @Provides
    fun provideMoneyRepo(dao: MoneyTransactionDao): MoneyRepository {
        return MoneyRepository(dao)
    }
}