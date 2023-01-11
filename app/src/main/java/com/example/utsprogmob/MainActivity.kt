package com.example.utsprogmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnAPI : Button
    lateinit var btnPUSH : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAPI = findViewById(R.id.btnGet)
        btnPUSH = findViewById(R.id.btnPost)

        btnAPI.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity,GetAPIActivity::class.java)
            startActivity(intent)})
        btnPUSH.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, AddAPIActivity::class.java)
            startActivity(intent)})
    }
}