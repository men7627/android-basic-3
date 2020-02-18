package com.example.android_basic_3

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveButton.setOnClickListener {
            val intent = Intent(applicationContext, SubActivity::class.java)
            intent.putExtra("MESSAGE", "MainActivity에서 왔습니다. ")
            startActivityForResult(intent, 1234)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 1234 && resultCode == Activity.RESULT_OK){
            messageText.text = data?.getStringExtra("MESSAGE")
        }
    }
}
