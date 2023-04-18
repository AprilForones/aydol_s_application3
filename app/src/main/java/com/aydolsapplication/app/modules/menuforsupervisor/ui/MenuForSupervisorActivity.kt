package com.aydolsapplication.app.modules.menuforsupervisor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityMenuForSupervisorBinding
import com.aydolsapplication.app.modules.menuforsupervisor.`data`.viewmodel.MenuForSupervisorVM
import com.aydolsapplication.app.modules.userpage.ui.UserPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuForSupervisorActivity :
    BaseActivity<ActivityMenuForSupervisorBinding>(R.layout.activity_menu_for_supervisor) {
  private val viewModel: MenuForSupervisorVM by viewModels<MenuForSupervisorVM>()

  private val REQUEST_CODE_USER_PAGE_ACTIVITY: Int = 760

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuForSupervisorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenubarOne.setOnClickListener {
      val destIntent = UserPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_USER_PAGE_ACTIVITY)
    }
    binding.linearRowapprovaltask.setOnClickListener {
      // TODO please, add your navigation code here
    }
  }

  companion object {
    const val TAG: String = "MENU_FOR_SUPERVISOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuForSupervisorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
