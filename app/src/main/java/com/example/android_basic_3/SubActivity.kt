package com.example.android_basic_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = getIntent()

        extraText.text = intent.getStringExtra("MESSAGE")

        okButton.setOnClickListener {  finish() }
    }
}
