package sontung.dangvu.moneytracker.db.moneytransaction

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MoneyTransactionDao {

    @Query ("SELECT * FROM money_table")
    fun getAll() : LiveData<List<MoneyTransaction>>

    @Query ("SELECT * FROM money_table WHERE type = :type")
    fun getTransactionInType(type: TransactionType) : LiveData<List<MoneyTransaction>>

    @Insert
    fun addNewTransaction(transaction: MoneyTransaction)

    @Delete
    fun deleteTransaction(transaction: MoneyTransaction)

    @Update
    fun updateTransaction(transaction: MoneyTransaction)

}