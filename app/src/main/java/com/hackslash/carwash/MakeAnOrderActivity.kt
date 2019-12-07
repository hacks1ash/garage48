package com.hackslash.carwash

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_make_an_order.*

class MakeAnOrderActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_an_order)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
