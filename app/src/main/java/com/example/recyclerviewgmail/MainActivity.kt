package com.example.recyclerviewgmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items: ArrayList<GmailModel> = arrayListOf()
    private val mAdapter: Adapter = Adapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        supportActionBar?.setDisplayShowHomeEnabled(false)
        supportActionBar?.setLogo(R.drawable.menu)
        supportActionBar?.setDisplayUseLogoEnabled(false)

        repeat(8) {
            items.add(
                GmailModel(
                    sender = "kotlin.com.vn",
                    title = "This is your change to learn Kotlin!",
                    content = "Today we will learn about RecyclerView.",
                    time = "10:00 AM",
                    logoPath = "https://haycafe.vn/wp-content/uploads/2022/02/Anh-avatar-doremon-do-mat.png",
                    isMark = false
                )
            )
        }

        findViewById<RecyclerView>(R.id.recycler_view).apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }
}