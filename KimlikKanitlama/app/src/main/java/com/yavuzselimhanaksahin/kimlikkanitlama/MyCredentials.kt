package com.yavuzselimhanaksahin.kimlikkanitlama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_my_credentials.*

class MyCredentials : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_credentials)

        setSupportActionBar(myToolbar)

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener { startActivity(Intent(this@MyCredentials, MainActivity::class.java)) }


        val iv_click_me = findViewById(R.id.imageView2) as ImageView
        // set on-click listener
        iv_click_me.setOnClickListener {
            startActivity(Intent(this@MyCredentials, SettingsActivity::class.java))

        }
        /*val button2 = findViewById<Button>(R.id.button2)
        button2?.setOnClickListener { startActivity(Intent(this@MyCredentials, SettingsActivity::class.java)) }*/
    }
}