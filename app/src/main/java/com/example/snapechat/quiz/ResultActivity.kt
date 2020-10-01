package com.example.snapechat.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.snapechat.R
import com.example.snapechat.loginSignup.ChooseLoginSignup
import com.example.snapechat.loginSignup.SignupActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private var res: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        checkHouse(totalQuestions, correctAnswers)
        if(res > 30)
        {
            textQuestion.text = "Slytherin!"
            textQuestion.setOnClickListener {
                startActivity(Intent(this, SignupActivity::class.java))
                finish()
            }
        }

        else
        {
            textQuestion.text = "Go away you discgrace!"
            textQuestion.setOnClickListener {
                startActivity(Intent(this, ChooseLoginSignup::class.java))
                finish()
            }
        }

    }

    private fun checkHouse(totalQuestions: Int, correctAnswers: Int) {
        res = (correctAnswers/totalQuestions) * 100
    }
}
