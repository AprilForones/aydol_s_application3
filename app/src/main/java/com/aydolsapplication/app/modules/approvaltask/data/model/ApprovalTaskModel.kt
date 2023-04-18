package com.aydolsapplication.app.modules.approvaltask.`data`.model

import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ApprovalTaskModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAPPROVALTASK: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_approval_task2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApprovalTaskOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_approval_task3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPD121202B01F: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pd_12_1202_b01f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSUBMITTED: String? = MyApp.getInstance().resources.getString(R.string.lbl_submitted)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt114A22BlkThirty: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_114a22_blk30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMG3FB: String? = MyApp.getInstance().resources.getString(R.string.lbl_mg3_fb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_0km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWCGrassCuttin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_wc_grass_cuttin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)

)
