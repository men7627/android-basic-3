package com.example.android_basic_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton.setOnClickListener {
            val transcation = supportFragmentManager.beginTransaction()
            transcation.replace(R.id.contentFrame, FirstFragment())
            transcation.addToBackStack(null)
            transcation.commit()
        }

        secondButton.setOnClickListener {
            val transcation = supportFragmentManager.beginTransaction()
            transcation.replace(R.id.contentFrame, SecondFragment())
            transcation.addToBackStack(null)
            transcation.commit()
        }
    }
}
