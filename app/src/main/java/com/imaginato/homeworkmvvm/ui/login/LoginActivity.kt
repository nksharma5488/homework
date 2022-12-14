package com.imaginato.homeworkmvvm.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.imaginato.homeworkmvvm.databinding.ActivityLoginBinding
import com.imaginato.homeworkmvvm.ui.home.HomeActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinApiExtension

@KoinApiExtension
class LoginActivity : AppCompatActivity() {

    private val viewModel by viewModel<LoginActivityViewModel>()
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDemo.setOnClickListener {
            if(validateUserNameAndPassword(binding.username.text.toString().trim(),binding.password.text.toString().trim()))
            viewModel.getLogin(binding.username.text.toString(),binding.password.text.toString())
        }
        initObserve()
    }
    private fun validateUserNameAndPassword(username:String,pass:String) : Boolean{
        if(username.isEmpty()){
            binding.usernameTl.error="User name is Empty"
            return false
        }
       else if(username.isEmpty()){
            binding.passwordTl.error="password is Empty"
            return false
        }
        return true
    }

    private fun initObserve() {
        viewModel.getLoginData.observe(this, Observer {
          //  binding.tvResult.text = it
            val intent = Intent(this@LoginActivity,HomeActivity::class.java)
            intent.putExtra("Username",it.loginData?.userName)
            intent.putExtra("UserId",it.loginData?.userId)
            intent.putExtra("isDeleted",it.loginData?.isDeleted)
            startActivity(intent)
            finish()
        })
        viewModel.progress.observe(this, Observer {
            binding.pbLoading.isVisible = it
        })
    }
}