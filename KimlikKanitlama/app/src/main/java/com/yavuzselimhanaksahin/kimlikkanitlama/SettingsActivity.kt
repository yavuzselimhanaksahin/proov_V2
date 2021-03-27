package com.yavuzselimhanaksahin.kimlikkanitlama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_my_credentials.*
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {
    lateinit var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
    lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setSupportActionBar(myToolbar2)

        layoutManager = LinearLayoutManager(this)
        recyclerView2.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView2.adapter = adapter

        val iv_click_me = findViewById(R.id.imageView2) as ImageView
        // set on-click listener
        iv_click_me.setOnClickListener {
            startActivity(Intent(this@SettingsActivity, MyCredentials::class.java))

        }
    }
}