package com.maxrzhe.quizapp

object Constants {
    fun getQuestions(): List<Question> {
        val questionsList = ArrayList<Question>()

        val qu1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = 0,
            optionOne = "",
            optionTwo = "",
            optionThree = "",
            optionFour = "",
            correctAnswer = 0
        )
        return questionsList
    }
}