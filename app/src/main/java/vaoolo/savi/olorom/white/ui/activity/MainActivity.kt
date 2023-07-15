package vaoolo.savi.olorom.white.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import vaoolo.savi.olorom.R
import vaoolo.savi.olorom.white.utils.PreferenceHelper

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var controllerNav: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_TSavior)
        Thread.sleep(2000)

        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        controllerNav = navHostFragment.navController

        when (PreferenceHelper.isStartApp) {
            true -> {
                controllerNav.navigate(R.id.chatFragment)
                controllerNav.popBackStack()
            }
            else -> {
                controllerNav.navigate(R.id.onBoardFragment)
            }
        }
    }
}