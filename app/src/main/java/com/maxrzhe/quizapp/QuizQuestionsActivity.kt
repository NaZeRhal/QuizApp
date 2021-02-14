package com.maxrzhe.quizapp

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.maxrzhe.quizapp.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binder: ActivityQuizQuestionsBinding
    private lateinit var mQuestionList: List<Question>

    private var mCurrentPosition: Int = 1
    private var mSelectedOptionPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityQuizQuestionsBinding.inflate(layoutInflater)

        with(binder) {
            val view = root
            setContentView(view)
            mQuestionList = Constants.getQuestions()

            setQuestion()

            tvOptionOne.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionTwo.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionThree.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionFour.setOnClickListener(this@QuizQuestionsActivity)

            btnSubmit.setOnClickListener(this@QuizQuestionsActivity)
        }


    }

    private fun setQuestion() {
        with(binder) {

            val question = mQuestionList[mCurrentPosition - 1]

            defaultOptionView()

            pbProgress.progress = mCurrentPosition

            val progressText = "$mCurrentPosition / ${pbProgress.max}"
            tvProgress.text = progressText

            tvQuestionId.text = question.question
            ivImage.setImageResource(question.image)
            tvOptionOne.text = question.optionOne
            tvOptionTwo.text = question.optionTwo
            tvOptionThree.text = question.optionThree
            tvOptionFour.text = question.optionFour
        }
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        with(binder) {
            options.add(0, tvOptionOne)
            options.add(1, tvOptionTwo)
            options.add(2, tvOptionThree)
            options.add(3, tvOptionFour)
        }

        options.forEach {
            it.setTextColor(ContextCompat.getColor(this, R.color.textHint))
            it.typeface = Typeface.DEFAULT
            it.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedNum: Int) {
        defaultOptionView()
        mSelectedOptionPosition = selectedNum
        with(tv) {
            setTextColor(ContextCompat.getColor(this@QuizQuestionsActivity, R.color.textMain))
            setTypeface(typeface, Typeface.BOLD)
            background =
                ContextCompat.getDrawable(this@QuizQuestionsActivity, R.drawable.selected_option_border_bg)
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        with(binder) {
            when (answer) {
                1 -> tvOptionOne.background =
                    ContextCompat.getDrawable(this@QuizQuestionsActivity, drawableView)
                2 -> tvOptionTwo.background =
                    ContextCompat.getDrawable(this@QuizQuestionsActivity, drawableView)
                3 -> tvOptionThree.background =
                    ContextCompat.getDrawable(this@QuizQuestionsActivity, drawableView)
                4 -> tvOptionFour.background =
                    ContextCompat.getDrawable(this@QuizQuestionsActivity, drawableView)

            }
        }

    }

    override fun onClick(v: View?) {
        with(binder) {
            when (v?.id) {
                tvOptionOne.id -> selectedOptionView(tvOptionOne, 1)
                tvOptionTwo.id -> selectedOptionView(tvOptionTwo, 2)
                tvOptionThree.id -> selectedOptionView(tvOptionThree, 3)
                tvOptionFour.id -> selectedOptionView(tvOptionFour, 4)
                btnSubmit.id -> {
                    if (mSelectedOptionPosition == 0) {
                        mCurrentPosition++
                    }
                }
            }
        }

    }
}


