package com.aydolsapplication.app.modules.approvaltask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.approvaltask.`data`.model.ApprovalTaskModel
import org.koin.core.KoinComponent

class ApprovalTaskVM : ViewModel(), KoinComponent {
  val approvalTaskModel: MutableLiveData<ApprovalTaskModel> = MutableLiveData(ApprovalTaskModel())

  var navArguments: Bundle? = null
}
