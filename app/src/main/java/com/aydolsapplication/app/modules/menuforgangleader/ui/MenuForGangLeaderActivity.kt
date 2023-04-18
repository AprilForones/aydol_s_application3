package com.aydolsapplication.app.modules.menuforgangleader.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityMenuForGangLeaderBinding
import com.aydolsapplication.app.modules.completedtask.ui.CompletedTaskActivity
import com.aydolsapplication.app.modules.menuforgangleader.`data`.viewmodel.MenuForGangLeaderVM
import com.aydolsapplication.app.modules.ongoingtaskpage.ui.OngoingTaskPageActivity
import com.aydolsapplication.app.modules.userpage.ui.UserPageActivity
import kotlin.String
import kotlin.Unit

class MenuForGangLeaderActivity :
    BaseActivity<ActivityMenuForGangLeaderBinding>(R.layout.activity_menu_for_gang_leader) {
  private val viewModel: MenuForGangLeaderVM by viewModels<MenuForGangLeaderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuForGangLeaderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnongoingtask.setOnClickListener {
      val destIntent = OngoingTaskPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackcompletedtask.setOnClickListener {
      val destIntent = CompletedTaskActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBellOne.setOnClickListener {
      // TODO please, add your navigation code here
    }
    binding.imageMenubarOne.setOnClickListener {
      val destIntent = UserPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_FOR_GANG_LEADER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuForGangLeaderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
