package com.aydolsapplication.app.modules.userpage.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UserPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUSERPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInspector: String? = MyApp.getInstance().resources.getString(R.string.lbl_inspector)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out2)

)
