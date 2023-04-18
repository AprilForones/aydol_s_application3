package com.aydolsapplication.app.modules.ongoingtaskpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aydolsapplication.app.modules.ongoingtaskpage.`data`.model.Listpd121202b01fRowModel
import com.aydolsapplication.app.modules.ongoingtaskpage.`data`.model.OngoingTaskPageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OngoingTaskPageVM : ViewModel(), KoinComponent {
  val ongoingTaskPageModel: MutableLiveData<OngoingTaskPageModel> =
      MutableLiveData(OngoingTaskPageModel())

  var navArguments: Bundle? = null

  val listpd121202b01fList: MutableLiveData<MutableList<Listpd121202b01fRowModel>> =
      MutableLiveData(mutableListOf())
}
