package com.example.githubuserfinder

import android.app.Application
import com.example.githubuserfinder.di.ApplicationComponent
import com.example.githubuserfinder.di.DaggerApplicationComponent

class GithubUserFinderApplication : Application() {
    lateinit var injector: ApplicationComponent


    override fun onCreate() {
        super.onCreate()
        injector = DaggerApplicationComponent.create()
    }
}