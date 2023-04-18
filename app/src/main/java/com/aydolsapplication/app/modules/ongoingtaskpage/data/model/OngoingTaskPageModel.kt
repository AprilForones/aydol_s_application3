package com.aydolsapplication.app.modules.ongoingtaskpage.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OngoingTaskPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtONGOINGTASK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ongoing_task2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourTaskLocat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_task_locat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_area_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreaCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_area_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreaCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_area_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreaCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_area_4)

)
