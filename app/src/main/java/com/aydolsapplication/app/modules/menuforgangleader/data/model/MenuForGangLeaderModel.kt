package com.aydolsapplication.app.modules.menuforgangleader.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuForGangLeaderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtONLINEMODE: String? = MyApp.getInstance().resources.getString(R.string.lbl_online_mode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiInspector: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_inspector)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_today_is_februa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_your_location_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt123456n567: String? = MyApp.getInstance().resources.getString(R.string.msg_123_456_n_567)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTASKORDERS: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtONGOINGTASK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ongoing_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCOMPLETEDTASK: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_completed_task)

)
