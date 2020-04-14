package com.example.dz_ls_coding_challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addItem(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivityForResult(intent,0)
    }
}
