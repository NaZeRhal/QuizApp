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
            correctAnswer = 1
        )
        val qu2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_china,
            optionOne = "Germany",
            optionTwo = "Italy",
            optionThree = "China",
            optionFour = "Japan",
            correctAnswer = 3
        )
        val qu3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_france,
            optionOne = "Portugal",
            optionTwo = "France",
            optionThree = "Sweden",
            optionFour = "Ireland",
            correctAnswer = 2
        )
        val qu4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_sweden,
            optionOne = "Argentina",
            optionTwo = "Spain",
            optionThree = "Sweden",
            optionFour = "Germany",
            correctAnswer = 3
        )
        val qu5 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_ireland,
            optionOne = "Mexico",
            optionTwo = "Portugal",
            optionThree = "Sweden",
            optionFour = "Ireland",
            correctAnswer = 4
        )

        val qu6 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_italy,
            optionOne = "Italy",
            optionTwo = "France",
            optionThree = "USA",
            optionFour = "China",
            correctAnswer = 1
        )
        val qu7 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_germany,
            optionOne = "China",
            optionTwo = "Ireland",
            optionThree = "Spain",
            optionFour = "Germany",
            correctAnswer = 4
        )

        questionsList.add(qu1)
        questionsList.add(qu2)
        questionsList.add(qu3)
        questionsList.add(qu4)
        questionsList.add(qu5)
        questionsList.add(qu6)
        questionsList.add(qu7)
        return questionsList
    }
}