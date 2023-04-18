package com.aydolsapplication.app.modules.login.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWELCOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGINTOCONTI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_to_cont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPASSWORD: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFORGOTPASSWORD: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUSEYOURTOUCH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_your_touch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleThreeValue: String? = null
)
