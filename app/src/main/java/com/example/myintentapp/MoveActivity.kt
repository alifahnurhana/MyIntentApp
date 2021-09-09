package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)


    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.btn_move_activity ->{
                val moveIntent = Intent(this, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }

    }
}