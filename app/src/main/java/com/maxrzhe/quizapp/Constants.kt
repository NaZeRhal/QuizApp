package com.maxrzhe.quizapp

object Constants {
    fun getQuestions(): List<Question> {
        val questionsList = ArrayList<Question>()

        val qu1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_argentina,
            optionOne = "Argentina",
            optionTwo = "USA",
            optionThree = "Mexico",
            optionFour = "China",
            correctAnswer = 0
        )
        return questionsList
    }
}