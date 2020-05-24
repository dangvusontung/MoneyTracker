package sontung.dangvu.moneytracker.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import sontung.dangvu.moneytracker.R
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyTransaction
import sontung.dangvu.moneytracker.db.moneytransaction.TransactionType

class TransactionAdapter constructor(
    private var transactionList: List<MoneyTransaction>
) : RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_list_item, parent, false)
        return TransactionViewHolder(view)
    }

    override fun getItemCount() = transactionList.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.bindView(position)
    }

    fun setData(list: List<MoneyTransaction>) {
        transactionList = list
        notifyDataSetChanged()
    }

    inner class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageType: ImageView
        private val transactionType: TextView
        private val transactionDescription: TextView
        private val transactionAmount: TextView

        init {
            itemView.apply {
                imageType = this.findViewById(R.id.image_type)
                transactionType = this.findViewById(R.id.transaction_type)
                transactionDescription = this.findViewById(R.id.transaction_description)
                transactionAmount = this.findViewById(R.id.transaction_amount)
            }
        }

        fun bindView(position: Int) {
            val moneyTransaction = transactionList[position]
            val restaurant = ContextCompat.getDrawable(itemView.context, R.drawable.ic_restaurant)
            val cafe = ContextCompat.getDrawable(itemView.context, R.drawable.ic_cafe)

            imageType.setImageDrawable(
                if (moneyTransaction.type == TransactionType.IN) restaurant
                else cafe
            )
            transactionType.text = moneyTransaction.type.toString()
            transactionAmount.text = moneyTransaction.transAmount.toString()
            transactionDescription.text = moneyTransaction.transDescription
        }

        private fun setIcon() {

        }
    }
}

