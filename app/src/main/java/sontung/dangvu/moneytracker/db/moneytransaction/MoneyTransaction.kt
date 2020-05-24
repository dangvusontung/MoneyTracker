package sontung.dangvu.moneytracker.db.moneytransaction

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity (tableName = "money_table")
class MoneyTransaction(
    @PrimaryKey
    val addedTime: Long,
    val transDescription : String,
    val transAmount : Int,
    @ColumnInfo(name = "type")
    val type: TransactionType,
    var transactionDate: Date
)