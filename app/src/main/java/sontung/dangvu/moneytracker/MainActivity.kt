package sontung.dangvu.moneytracker

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MainActivityT"

class MainActivity : DaggerAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        bottom_navigation.setOnNavigationItemSelectedListener(onMenuItemSelectedListener)
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment)
        val navController = findNavController(R.id.fragment)

        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.nav_list,
                R.id.nav_report,
                R.id.nav_plan
            )
        )

        NavigationUI.setupWithNavController(bottom_navigation, navController)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
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
                    else -> false
                }
            }
        }

}
