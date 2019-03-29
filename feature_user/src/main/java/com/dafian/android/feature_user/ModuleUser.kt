package com.dafian.android.feature_user

import com.dafian.android.feature_user.data.RestServiceFactory
import com.dafian.android.feature_user.repository.UserRepository
import com.dafian.android.feature_user.repository.UserRepositoryImpl
import com.dafian.android.feature_user.ui.UserPresenter
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val moduleUser = module {

    single(name = "user_client") { RestServiceFactory.makeClientService(get(), get()) }

    single { RestServiceFactory.makeRestService(get(), get(name = "user_client"), get()) }

    single<UserRepository> { UserRepositoryImpl(get()) }

    viewModel { UserPresenter(get()) }
}