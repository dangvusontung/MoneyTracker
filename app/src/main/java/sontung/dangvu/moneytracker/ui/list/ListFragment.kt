package sontung.dangvu.moneytracker.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_list.*
import sontung.dangvu.moneytracker.R
import sontung.dangvu.moneytracker.db.moneytransaction.MoneyTransaction
import sontung.dangvu.moneytracker.db.moneytransaction.TransactionType
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListFragment @Inject constructor() : DaggerFragment() {

    @Inject
    lateinit var viewModel: MoneyViewModel

    lateinit var transactionAdapter: TransactionAdapter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transactionAdapter = TransactionAdapter(ArrayList())
        list_transaction.apply {
            adapter = transactionAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        getData()
    }

    private fun getData() {
        val list = ArrayList<MoneyTransaction>()

        val transaction = MoneyTransaction(
            System.currentTimeMillis(),
            "test",
            10000,
            TransactionType.IN,
            Date(System.currentTimeMillis())
        )

        val transaction2 = MoneyTransaction(
            System.currentTimeMillis(),
            "test",
            10000,
            TransactionType.IN,
            Date(System.currentTimeMillis())
        )

        val transaction3 = MoneyTransaction(
            System.currentTimeMillis(),
            "test",
            10000,
            TransactionType.IN,
            Date(System.currentTimeMillis())
        )

        list.apply {
            add(transaction)
            add(transaction2)
            add(transaction3)
        }

        transactionAdapter.setData(list)
    }

}
