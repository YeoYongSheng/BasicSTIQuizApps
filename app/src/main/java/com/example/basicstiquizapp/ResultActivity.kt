package com.example.basicstiquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
         val username = intent.getStringExtra(Constants.USER_NAME)
         val tv_name = findViewById(R.id.tv_name) as TextView
        tv_name.text= username

         val totalQuestion=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0 )
          val correctAnswer=intent.getIntExtra(Constants.CORRECT_ANSWERS,0 )
        val tv_score = findViewById(R.id.tv_score) as TextView
           tv_score.text = " Your Score is $correctAnswer out of $totalQuestion"
        val btn_finish = findViewById(R.id.btn_finish) as Button
        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}