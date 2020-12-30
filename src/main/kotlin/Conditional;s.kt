fun main(){
    // Operators
    // ==

    var one = 5
    var two = 5

    if(one == two){
        println("Hello")
    }else{
        println("No")
    }

    //!=
    if(one != two){
        println("Hello Two")
    }else{
        println("No Two")
    }

    //Greater than
    if(one > two){
        println("Hello Three")
    }else{
        println("No Three")
    }

    //Greater than or equal to
    if(one >= two){
        println("Hello Four")
    }else{
        println("No Four")
    }


    //Same principles for less than
     //If, else if ,else
    if(one == 6){
        println("Yes if")
    }
    else if( one == 10){
        println("Yes else if")
    }
    else{
        println("Fail safe else")
    }

    //Return true or false in statement
    println("Is 5 greater than 2 ? ${5 > 2} ")

}