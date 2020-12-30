fun main(){
    //When statement is an advanced switch statement

    var season = 3

    when(season){
        1 -> println("Spring")
        2-> println("Summer")
        3 -> {
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Not a valid season")
    }

    var month = 3
    when(month){
        //in the range
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        //In any of these result true
        12,1, 2 -> println("Wimter")

        else -> println("Not a valid month")
    }

}