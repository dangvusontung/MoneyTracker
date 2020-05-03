package sontung.dangvu.moneytracker.db.moneytransaction

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import sontung.dangvu.moneytracker.db.typeconverter.Converters

@Entity (tableName = "money_table")
class MoneyTransaction(
    @PrimaryKey
    val transTime : Long,
    val transDescription : String,
    val transAmount : Int,
    @ColumnInfo(name = "type")
    @TypeConverters(Converters::class)
    val type : TransactionType
)