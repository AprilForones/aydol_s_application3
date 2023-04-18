package com.aydolsapplication.app.modules.userpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.userpage.`data`.model.UserPageModel
import org.koin.core.KoinComponent

class UserPageVM : ViewModel(), KoinComponent {
  val userPageModel: MutableLiveData<UserPageModel> = MutableLiveData(UserPageModel())

  var navArguments: Bundle? = null
}
