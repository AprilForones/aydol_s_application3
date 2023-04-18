package com.aydolsapplication.app.modules.completedtask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.completedtask.`data`.model.CompletedTaskModel
import org.koin.core.KoinComponent

class CompletedTaskVM : ViewModel(), KoinComponent {
  val completedTaskModel: MutableLiveData<CompletedTaskModel> =
      MutableLiveData(CompletedTaskModel())

  var navArguments: Bundle? = null
}
