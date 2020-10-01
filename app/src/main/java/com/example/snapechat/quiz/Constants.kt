package com.example.snapechat.quiz

object Constants {
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        val questionList = ArrayList<Questions>()
        val ques1 = Questions(1, "What is common trait among Slytherins?", "Unrequited love", "Mood Swings", "Victimization", 1)
        val ques2 = Questions(2, "What are true colors of Slytherin's house?", "Green & White", "Green & Black", "Green & Silver", 3)
        val ques3 = Questions(3, "Who is the founder of Slytherin house?", "Severus Snape", "Salazaar Slytherin", "Bloody Baron", 2)
        val ques4 = Questions(4, "Which of these traits describe you the most?", "Cunning", "Proud", "Curious", 1)
        val ques5 = Questions(5, "Which of these wizard was a Slytherin?", "Xenophillius Lovegood", "Horace Slughorn", "Bridget Wenlock", 2)
        val ques6 = Questions(6, "What is the color green representative of?", "The color of lakes", "The color of snake", "The color of moss", 1)
        val ques7 = Questions(7, "What is the color silver representative of?", "The color of snake scales", "The color of rain water", "Ther color of a storm sky", 2)
        val ques8 = Questions(8, "Which death eater is not a Slytherin?", "Bellatrix Lestrange", "Peter Pettigrew", "Barty Crouch Jr.", 2)
        val ques9 = Questions(9, "What body of nature are Slytherin dungeons located under?", "Quidditch Field", "Middle Courtyard", "Black Lake", 3)
        val ques10 = Questions(10, "What time period was Slytherin's ghost born?", "Middle Ages", "1800's", "1900's", 1)
        questionList.add(ques1)
        questionList.add(ques2)
        questionList.add(ques3)
        questionList.add(ques4)
        questionList.add(ques5)
        questionList.add(ques6)
        questionList.add(ques7)
        questionList.add(ques8)
        questionList.add(ques9)
        questionList.add(ques10)
        return questionList
    }
}