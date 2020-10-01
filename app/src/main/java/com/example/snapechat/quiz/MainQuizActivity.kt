package com.example.snapechat.quiz

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.snapechat.R
import kotlinx.android.synthetic.main.activity_quiz_main.*
import kotlinx.android.synthetic.main.activity_quiz_main.textQuestion






class MainQuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition = 0
    private var mQuestionList: ArrayList<Questions> ?= null
    private var mCorrectAnswer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_main)

        mQuestionList = Constants.getQuestions()

        progressbar.progress = 0


        setQuestions()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
    }

    private fun setQuestions() {

        progressbar.progress = 0
        val question = mQuestionList!![mCurrentPosition]


        textQuestion.text = question.question
        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        object : CountDownTimer(30000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                progressbar.progress = (millisUntilFinished/100).toInt()
            }

            override fun onFinish() {
                progressbar.progress = 100
                mCurrentPosition++

                if(mCurrentPosition < mQuestionList!!.size)
                {
                    setQuestions()
                }
                else{
                    val intent = Intent(this@MainQuizActivity, ResultActivity::class.java)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                    startActivity(intent)
                    finish()
                }
            }
        }.start()
    }

    override fun onClick(v: View?) {
        val question = mQuestionList!![mCurrentPosition]
        when (v?.id) {
            R.id.option1 -> {
                if(question.correctAnswer == 1)
                    mCorrectAnswer++

                mCurrentPosition++

                if(mCurrentPosition < mQuestionList!!.size)
                {
                    setQuestions()
                }
                else{
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                    startActivity(intent)
                    finish()
                }

            }

            R.id.option2 -> {
                if(question.correctAnswer == 2)
                    mCorrectAnswer++

                mCurrentPosition++

                if(mCurrentPosition < mQuestionList!!.size)
                {
                    setQuestions()
                }
                else{
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                    startActivity(intent)
                    finish()
                }

            }

            R.id.option3 -> {
                if(question.correctAnswer == 3)
                    mCorrectAnswer++

                mCurrentPosition++

                if(mCurrentPosition < mQuestionList!!.size)
                {
                    setQuestions()
                }
                else{
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                    startActivity(intent)
                    finish()
                }
                }
            }
        }
    }