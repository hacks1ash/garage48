package com.hackslash.carwash

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_service_choose.*

class ServiceChooseActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_choose)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

}
