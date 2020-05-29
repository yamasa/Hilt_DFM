package com.example.hilt_dfm

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepository @Inject constructor() {

    fun getMessage(): String {
        return "Hello, Hilt!"
    }
}
