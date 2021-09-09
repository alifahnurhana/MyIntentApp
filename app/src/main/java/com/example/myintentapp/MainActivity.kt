package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener {
            val moveIntent = Intent(this, MoveActivity::class.java)
            startActivity(moveIntent)
        }
        val btnActivityData: Button = findViewById(R.id.btn_move_activity_data)
        btnActivityData.setOnClickListener {

            val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
            startActivity(moveWithDataIntent)

        }


    }


}