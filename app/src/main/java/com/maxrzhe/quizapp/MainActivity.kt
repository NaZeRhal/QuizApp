package com.maxrzhe.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.maxrzhe.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)

        with(binder) {
            setContentView(root)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.setDecorFitsSystemWindows(false)
            } else {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            }

            startButton.setOnClickListener {
                if (etName.text.toString().isEmpty()) {
                    Toast.makeText(this@MainActivity, getString(R.string.please_enter_your_name), Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, etName.text.toString())
                    startActivity(intent)
                    finish()
                }
            }
        }


    }
}