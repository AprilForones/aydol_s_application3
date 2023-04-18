package com.aydolsapplication.app.modules.menuforsupervisor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.menuforsupervisor.`data`.model.MenuForSupervisorModel
import org.koin.core.KoinComponent

class MenuForSupervisorVM : ViewModel(), KoinComponent {
  val menuForSupervisorModel: MutableLiveData<MenuForSupervisorModel> =
      MutableLiveData(MenuForSupervisorModel())

  var navArguments: Bundle? = null
}
