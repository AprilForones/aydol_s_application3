package com.aydolsapplication.app.modules.userpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aydolsapplication.app.R
import com.aydolsapplication.app.appcomponents.base.BaseActivity
import com.aydolsapplication.app.databinding.ActivityUserPageBinding
import com.aydolsapplication.app.modules.login.ui.LoginActivity
import com.aydolsapplication.app.modules.userpage.`data`.viewmodel.UserPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UserPageActivity : BaseActivity<ActivityUserPageBinding>(R.layout.activity_user_page) {
  private val viewModel: UserPageVM by viewModels<UserPageVM>()

  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 131

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogoutOne.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "USER_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
