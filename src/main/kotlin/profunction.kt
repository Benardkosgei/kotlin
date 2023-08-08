fun getfullname(fname:String, lname:String =""):String{
    return if(lname.isNotEmpty()){
        "$fname $lname"
    }else{
        fname
    }
}
fun main() {
    val student1 = getfullname("Benard","Kosgei")
    println(student1)
    val correctAnswr = 8
    val totalQuestions = 10
    val score = calculateScore(correctAnswr,totalQuestions)
    println("The score is $score.")
}
//Calculate score
fun calculateScore(correctAnswr:Int, totalQuestions:Int):Int{
    return(correctAnswr * 100)/totalQuestions
}