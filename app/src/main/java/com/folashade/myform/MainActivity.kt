package com.folashade.myform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var joinButton: Button = findViewById(R.id.joinButton)


        joinButton.setOnClickListener{
            val intent = Intent (this, LoginActivity::class.java)
            this.startActivity(intent)
        }
    }
}