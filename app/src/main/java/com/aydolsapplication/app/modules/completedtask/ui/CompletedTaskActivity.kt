package com.aydolsapplication.app.modules.completedtask.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityCompletedTaskBinding
import com.aydolsapplication.app.modules.completedtask.`data`.viewmodel.CompletedTaskVM
import com.aydolsapplication.app.modules.menuforgangleader.ui.MenuForGangLeaderActivity
import kotlin.String
import kotlin.Unit

class CompletedTaskActivity :
    BaseActivity<ActivityCompletedTaskBinding>(R.layout.activity_completed_task) {
  private val viewModel: CompletedTaskVM by viewModels<CompletedTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.completedTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePreviousOne.setOnClickListener {
      val destIntent = MenuForGangLeaderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMPLETED_TASK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CompletedTaskActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
