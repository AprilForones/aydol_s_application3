package com.aydolsapplication.app.modules.ongoingtaskpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityOngoingTaskPageBinding
import com.aydolsapplication.app.modules.menuforgangleader.ui.MenuForGangLeaderActivity
import com.aydolsapplication.app.modules.ongoingtaskpage.`data`.model.Listpd121202b01fRowModel
import com.aydolsapplication.app.modules.ongoingtaskpage.`data`.viewmodel.OngoingTaskPageVM
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlin.Int
import kotlin.String
import kotlin.Unit

abstract class OngoingTaskPageActivity :
    BaseActivity<ActivityOngoingTaskPageBinding>(R.layout.activity_ongoing_task_page),
    OnMapReadyCallback {
//  private val viewModel: OngoingTaskPageVM by viewModels<OngoingTaskPageVM>()

//  private var mMap: GoogleMap? = null


//  override fun onInitialized(): Unit {
//    viewModel.navArguments = intent.extras?.getBundle("bundle")
//    val listpd121202b01fAdapter =
//    Listpd121202b01fAdapter(viewModel.listpd121202b01fList.value?:mutableListOf())
//    binding.recyclerListpd121202b01f.adapter = listpd121202b01fAdapter
//    listpd121202b01fAdapter.setOnItemClickListener(
//    object : Listpd121202b01fAdapter.OnItemClickListener {
//      override fun onItemClick(view:View, position:Int, item : Listpd121202b01fRowModel) {
//        onClickRecyclerListpd121202b01f(view, position, item)
//      }
//    }
//    )
//    viewModel.listpd121202b01fList.observe(this) {
//      listpd121202b01fAdapter.updateData(it)
//    }
//    binding.ongoingTaskPageVM = viewModel
//    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapMap) as?
//    SupportMapFragment
//    mapFragment?.getMapAsync(this)
//  }

//  override fun onMapReady(p0: GoogleMap): Unit {
//    mMap = p0
//  }
//
//  override fun setUpClicks(): Unit {
//    binding.imagePreviousOne.setOnClickListener {
//      val destIntent = MenuForGangLeaderActivity.getIntent(this, null)
//      startActivity(destIntent)
//    }
//  }

//  fun onClickRecyclerListpd121202b01f(
//    view: View,
//    position: Int,
//    item: Listpd121202b01fRowModel
//  ): Unit {
//    when(view.id) {
//    }
//  }


  //  companion object {
//    const val TAG: String = "ONGOING_TASK_PAGE_ACTIVITY"
//
//
//    fun getIntent(context: Context, bundle: Bundle?): Intent {
//      val destIntent = Intent(context, OngoingTaskPageActivity::class.java)
//      destIntent.putExtra("bundle", bundle)
//      return destIntent
//    }
//  }
  override fun setUpClicks() {
    TODO("Not yet implemented")
  }

    companion object {
        fun getIntent(
            menuForGangLeaderActivity: MenuForGangLeaderActivity,
            nothing: Nothing?
        ): Intent? {
            TODO("Not yet implemented")
        }
    }
}
