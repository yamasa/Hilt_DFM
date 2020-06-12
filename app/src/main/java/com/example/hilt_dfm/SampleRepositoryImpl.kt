package com.example.hilt_dfm

import com.example.hilt_dfm.base.SampleRepository

internal class SampleRepositoryImpl : SampleRepository {

    override fun getMessage(): String {
        return "Hello, Hilt!"
    }
}
