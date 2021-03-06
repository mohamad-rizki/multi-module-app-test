package com.dafian.android.navigation

import com.dafian.android.common.moduleCommon
import com.dafian.android.feature_album.moduleAlbum
import com.dafian.android.feature_todo.moduleTodo
import com.dafian.android.feature_user.moduleUser

fun injectFeature() = loadModuleFeature

private val loadModuleFeature by lazy {
    listOf(
        moduleCommon,
        moduleAlbum,
        moduleTodo,
        moduleUser
    )
}