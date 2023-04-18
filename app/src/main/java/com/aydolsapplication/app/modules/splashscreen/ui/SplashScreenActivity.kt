package com.aydolsapplication.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivitySplashScreenBinding
import com.aydolsapplication.app.modules.login.ui.LoginActivity
import com.aydolsapplication.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {

  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {

    //disable actionbar
    supportActionBar?.hide()

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameSplashScreen.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

    }
  }
