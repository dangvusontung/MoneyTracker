package sontung.dangvu.moneytracker

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MainActivityT"

class MainActivity : DaggerAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener(onMenuItemSelectedListener)
        val navController = findNavController(R.id.fragment)
        NavigationUI.setupWithNavController(bottom_navigation, navController)
    }

    private val onMenuItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                Log.d(TAG, " ???")
                return when (item.itemId) {
                    R.id.nav_list -> {
                        Log.d(TAG, "nav_list")
                        true
                    }
                    R.id.nav_plan -> {
                        Log.d(TAG, "nav_plan")
                        true
                    }
                    R.id.nav_report -> {
                        Log.d(TAG, "nav_report")
                        true
                    }
                    R.id.nav_setting -> {
                        Log.d(TAG, "nav_setting")
                        true
                    }
                    else -> false
                }
            }
        }
}
