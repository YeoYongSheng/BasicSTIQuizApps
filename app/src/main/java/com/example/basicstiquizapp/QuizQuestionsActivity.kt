package com.example.basicstiquizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import java.lang.reflect.Constructor

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int=1
    private var mQuestionsList: ArrayList<Question>?=null
    private var mSelectedOptionPosition: Int=0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String?=null

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        mUserName=intent.getStringExtra(Constants.USER_NAME)
        mQuestionsList = Constants.getQuestions()
        setQuestion()
        val tv_option_one = findViewById(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById(R.id.tv_option_four) as TextView
        val btn_submit = findViewById(R.id.btn_submit) as Button
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)



    }
    private fun setQuestion(){

        val question= mQuestionsList!![mCurrentPosition-1]
        defaultOptionsView()

        val progressBar = findViewById(R.id.progressBar) as ProgressBar
        val tv_progress = findViewById(R.id.tv_progress) as TextView
        val tv_question = findViewById(R.id.tv_question) as TextView
        val iv_image = findViewById(R.id.iv_image) as ImageView
        val tv_option_one = findViewById(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById(R.id.tv_option_four) as TextView
        val btn_submit = findViewById(R.id.btn_submit) as Button

        if (mCurrentPosition== mQuestionsList!!.size){
            btn_submit.text= "FINISH"
        }else{
            btn_submit.text= "SUBMIT"
        }

        progressBar.progress=mCurrentPosition
        tv_progress.text = "$mCurrentPosition"+"/"+progressBar.max
        tv_question.text=question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text=question.optionOne
        tv_option_two.text=question.optionTwo
        tv_option_three.text=question.optionThree
        tv_option_four.text=question.optionFour
    }

    private fun defaultOptionsView(){
        val tv_option_one = findViewById(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById(R.id.tv_option_four) as TextView
        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background= ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }
    override fun onClick(v:View?){
        val tv_option_one = findViewById(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById(R.id.tv_option_four) as TextView
        val btn_submit = findViewById(R.id.btn_submit) as Button
        when (v?.id){
            R.id.tv_option_one->{
                selectedOptionView(tv_option_one,selectedOptionNum= 1)
            }
            R.id.tv_option_two->{
                selectedOptionView(tv_option_two,selectedOptionNum= 2)
            }
            R.id.tv_option_three->{
            selectedOptionView(tv_option_three,selectedOptionNum= 3)
        }
            R.id.tv_option_four->{
                selectedOptionView(tv_option_four,selectedOptionNum= 4)
            }
            R.id.btn_submit->{
                if (mSelectedOptionPosition==0){
                    mCurrentPosition++

                    when {
                        mCurrentPosition<=mQuestionsList!!.size ->{
                            setQuestion()
                        }
                       else-> {
                        val intent= Intent(this, ResultActivity::class.java)
                           intent.putExtra(Constants.USER_NAME,mUserName)
                           intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                           intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList!!.size)
                       startActivity(intent)
                        //finish()
                    }
                    }
                }else {
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if (question !!.correctAnswer!=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition==mQuestionsList!!.size){
                        btn_submit.text="FINISH"
                    } else{
                        btn_submit.text="GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition= 0
                }

            }
        }
    }
    private fun answerView(answer: Int, drawAbleView: Int){
        val tv_option_one = findViewById(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById(R.id.tv_option_four) as TextView
        val btn_submit = findViewById(R.id.btn_submit) as Button
        when (answer){
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this, drawAbleView)
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this, drawAbleView)
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this, drawAbleView)
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this, drawAbleView)
            }
        }
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition= selectedOptionNum

        tv.setTextColor(Color.parseColor("#FF6200EE"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
    }


}