package sontung.dangvu.moneytracker.ui.report

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.android.support.DaggerFragment
import sontung.dangvu.moneytracker.R
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class ReportFragment @Inject constructor() : DaggerFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_report, container, false)
    }

}
