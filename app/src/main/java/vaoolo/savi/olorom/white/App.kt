package vaoolo.savi.olorom.white

import android.app.Application
import vaoolo.savi.olorom.white.utils.PreferenceHelper

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.units(this)
    }
}