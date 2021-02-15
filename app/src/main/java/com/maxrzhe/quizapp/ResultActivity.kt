package com.maxrzhe.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maxrzhe.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binder: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binder = ActivityResultBinding.inflate(layoutInflater)

        with(binder) {
            setContentView(root)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.setDecorFitsSystemWindows(false)
            } else {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            }

            val userName = intent.getStringExtra(Constants.USER_NAME)
            tvName.text = userName

            val totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
            val correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)

            val scoreText = String.format(getString(R.string.result_score), correctAnswers, totalQuestions)
            tvScore.text = scoreText

            btnFinish.setOnClickListener {
                startActivity(Intent(this@ResultActivity, MainActivity::class.java))
            }

        }
    }
}