package com.imaginato.homeworkmvvm.ui.login
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.Observer
import com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse
import com.imaginato.homeworkmvvm.domain.*
import org.junit.*
import org.junit.Assert.*
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.mockito.Mock


class LoginActivityViewModelTest: KoinTest {


    @OptIn(KoinApiExtension::class)
    val loginActivityViewModel:LoginActivityViewModel by inject()

    @Mock
    var lifecycleOwner: LifecycleOwner? = null
    var lifecycle: Lifecycle? = null

    @OptIn(KoinApiExtension::class)
    @Before
    fun setup() {

        startKoin {
            module { single { apiModules} }
            module { single { databaseModule} }
            module { single { viewModelModules} }
            module { single { netModules} }
            module { single { repositoryModules} }

        }
        lifecycle = lifecycleOwner?.let { LifecycleRegistry(it) }
        loginActivityViewModel.getLoginData.observeForever { lifecycle }
    }


    @OptIn(KoinApiExtension::class)
    @Test
    fun testBlank() {
        loginActivityViewModel.getLogin("","")
        assertNotNull(loginActivityViewModel.getLoginData)
        assertTrue(loginActivityViewModel.getLoginData.hasObservers())
    }

    @After
    fun tearDown() {
        stopKoin()
    }

}