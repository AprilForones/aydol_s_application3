package com.aydolsapplication.app.modules.splashscreen.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSunshineForAl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sunshine_for_al)

)
