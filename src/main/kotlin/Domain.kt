class Domain {
}

// author, student, quiz, questions, answers
// quiz -- (*) questions, duration
// question - question-description, difficulty-level enum, 2(*) choices , correct answer, section
// answer -- desc


data class Question(
    val description: String,
    val difficulty: Difficulty,
    val answers: List<Answer>,
    val correctAnswer: Answer,
    val section:String,
    val author: Author
)

data class Quiz(val questions: List<Question>, val duration: Minutes)

data class Author(val name: String)



@JvmInline
value class Minutes(val m: Int)

data class Answer(val id: Int, val text: String)

enum class Difficulty {
    HARD,MEDIUM, EASY
}
