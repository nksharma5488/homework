package com.imaginato.homeworkmvvm.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.imaginato.homeworkmvvm.data.local.login.UserInfo
import com.imaginato.homeworkmvvm.data.local.login.UserInfoRepository
import com.imaginato.homeworkmvvm.data.remote.login.LoginRepository
import com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse
import com.imaginato.homeworkmvvm.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import okhttp3.Headers
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.inject

@KoinApiExtension
class LoginActivityViewModel(private val userInfoRepository: UserInfoRepository) : BaseViewModel() {
    private val repository: LoginRepository by inject()
    private var _resultLiveData: MutableLiveData<LoginResponse> = MutableLiveData()
    private var _progress: MutableLiveData<Boolean> = MutableLiveData()
        val progress: LiveData<Boolean>
        get() {
            return _progress
        }

    val getLoginData: LiveData<LoginResponse>
        get() {
            return _resultLiveData
        }

    fun getLogin(userName:String, password:String) {
        viewModelScope.launch {
            repository.getLogin(userName, password)
                .onStart {
                    _progress.value = true
                }.catch {
                    _progress.value = false
                }
                .onCompletion {

                }.collect {
                    val headers: Headers =it.headers()
                    _progress.value = false
                    _resultLiveData.value = it.body()
                    val loginData=it.body()?.loginData
                    viewModelScope.launch(Dispatchers.IO) {
                       if(loginData!=null){
                           userInfoRepository.insertUser(UserInfo(loginData.userId!!,loginData.userName!!,loginData.isDeleted!!,
                               headers["X-Acc"]!!
                           ))
                       }
                    }
                }
        }
    }
}