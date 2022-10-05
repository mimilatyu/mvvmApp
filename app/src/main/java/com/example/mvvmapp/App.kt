package com.example.mvvmapp

import android.app.Application
import com.example.mvvmapp.model.UsersService

class App: Application() {
    val usersService = UsersService()
}