package com.aydolsapplication.app.modules.approvaltask.ui

import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityApprovalTaskBinding
import com.aydolsapplication.app.modules.approvaltask.`data`.viewmodel.ApprovalTaskVM
import com.aydolsapplication.app.modules.menuforsupervisor.ui.MenuForSupervisorActivity
import kotlin.String
import kotlin.Unit

class ApprovalTaskActivity :
    BaseActivity<ActivityApprovalTaskBinding>(R.layout.activity_approval_task) {
  private val viewModel: ApprovalTaskVM by viewModels<ApprovalTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.approvalTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePreviousOne.setOnClickListener {
      val destIntent = MenuForSupervisorActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APPROVAL_TASK_ACTIVITY"

  }
}
