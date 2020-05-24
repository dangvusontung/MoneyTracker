package sontung.dangvu.moneytracker.db.typeconverter

import androidx.room.TypeConverter
import sontung.dangvu.moneytracker.db.moneytransaction.TransactionType
import java.util.*

class Converters {

    @TypeConverter
    fun fromTransTypeToInt(value: TransactionType) : Int {
        return value.type
    }

    @TypeConverter
    fun fromIntToTransType(value : Int) : TransactionType {
        return when(value) {
            1 -> TransactionType.IN
            2 -> TransactionType.OUT
            else -> throw UnknownFormatConversionException("Unknown type of transaction")
        }
    }

    @TypeConverter
    fun fromLongToDate(stamp: Long): Date {
        return Date(stamp)
    }

    @TypeConverter
    fun fromDateToLong(date: Date): Long {
        return date.time
    }

}