package sontung.dangvu.moneytracker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyTransaction
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyTransactionDao
import sontung.dangvu.moneytracker.db.typeconverter.Converters

@Database (entities = [MoneyTransaction::class], version = 0, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun moneyDao() : MoneyTransactionDao
}