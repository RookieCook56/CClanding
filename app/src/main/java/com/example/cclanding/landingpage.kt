package com.example.cclanding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.Button

class landingpage : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cclanding);

        val loginbtn = findViewById<Button>(R.id.lgbtn)
        loginbtn.setOnClickListener {

            val Intent = Intent(this, Login::class.java)
            startActivity(Intent)
        }

            val registerbtn = findViewById<Button>(R.id.rgrbtn)
            registerbtn.setOnClickListener {

                val Intent = Intent(this, register::class.java)
                startActivity(Intent)
            }



    }
}
