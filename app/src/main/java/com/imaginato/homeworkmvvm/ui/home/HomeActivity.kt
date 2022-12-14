package com.imaginato.homeworkmvvm.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.imaginato.homeworkmvvm.R
import com.imaginato.homeworkmvvm.databinding.ActivityHomeBinding
import com.imaginato.homeworkmvvm.databinding.ActivityLoginBinding
import com.imaginato.homeworkmvvm.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinApiExtension

@KoinApiExtension
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showUserInfo(intent)
    }

    private fun showUserInfo(intent: Intent) {
        val profileName=intent.getStringExtra("Username")
        val userId=intent.getStringExtra("UserId")
        val isDeleted:Boolean=intent.getBooleanExtra("isDeleted",false)
        binding.usernameTv.text = String.format(getString(R.string.user_name),profileName)
        binding.userIdTv.text = String.format(getString(R.string.user_id),userId)
        binding.isDeleted.text = String.format(getString(R.string.user_is_deleted),isDeleted)
    }
}