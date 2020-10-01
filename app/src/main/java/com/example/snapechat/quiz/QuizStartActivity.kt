package com.example.snapechat.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.snapechat.R
import kotlinx.android.synthetic.main.activity_start_quiz.*

class QuizStartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)
        textQuestion.setOnClickListener{
            val intent =
                Intent(this, MainQuizActivity::class.java)
            startActivity(intent)
        }
    }
}