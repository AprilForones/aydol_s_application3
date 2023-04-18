package com.aydolsapplication.app.modules.menuforgangleader.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.menuforgangleader.`data`.model.MenuForGangLeaderModel
import org.koin.core.KoinComponent

class MenuForGangLeaderVM : ViewModel(), KoinComponent {
  val menuForGangLeaderModel: MutableLiveData<MenuForGangLeaderModel> =
      MutableLiveData(MenuForGangLeaderModel())

  var navArguments: Bundle? = null
}
