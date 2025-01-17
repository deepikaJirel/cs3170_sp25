/* 
    Name: Dipka Jirel
    In-Class Problems 1
    Kotlin Basics
*/

fun main() {

    // 1. Print these messages on separate lines
    
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
    

    // 2. Uncomment the following code and fix the compile error
     println("New chat message from a friend")

    // 3. Uncomment the following and fix the compile error

    val discountPercentage = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    println(discountPercentage)
    println("discountPercentage: $discountPercentage")
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println("(offer)")


    // 4. Uncomment and fix this code so it prints:
    // The total part size is: 50
    /*
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("total: $total")
    println("The total party size is: $total")
     

    // 5. Uncomment and fix this code so it compiles

    val numCats: Int = 2
    val numDogs: Int = 2
    numDogs += numCats
    

    // 6. After fixing number 5, write a print statement to print the number
    // of cats and dogs using the variables, like:
    // There are 2 cats and 4 dogs
    println(" There are $numCats cats and $numDogs dogs")

    // 7. Write a when statement that prints whether there are more cats than 
    // dogs, more dogs than cats, are there are the same number of each.
    when{
    numCats> numDogs-> println("There are more cats than dogs")
    numCats<numDogs ->println("There are more dogs than cats")
    else -> println("There are the same number of each")
    }

    // 8. Use when to determine if a character is a vowel or consonant and
    // print the result. Char has methods named lowerCaseChar() and
    // upperCaseChar() you can use, or you can assume upper/lowercase
    val Character: char ='a'
    when (char.lowercaseChar()) {
    'a', 'e', 'i', 'o', 'u' -> println("$char is a vowel")
    else -> println("$char is a consonant")
}

    // 9. Use a for loop to print the numbers 0 to 9 in reverse order. Hint -
    // there is a downTo keyword
    for(i in 9 downTo 0) {
    println(i)
    }
    

    // 10. Create one list with 3 of your favorite shows/movies/games/etc. and
    // print the list
    fun testArrays()
    val favList = arrayOf("Life of Pi","Avatar","Rose")
    println(favList)
    

    // 11. Create another list with 2 or 3 of your least favorite shows/movies/
    // /games/etc. Then, create a third list that contains everything from both lists.
    // Print out this new list.
     val leastFav = listOf("Ram", "Rom")
     val combinedList = favorites + leastFav
     println(combinedList)



    // 12. Remove your most and least favorite from the combined list, and print
    // this new list. (You may need to modify what you did for 10 and 11)


    // 13. Create a string variable and set it to null, then print the string
    var St: String? = null
     println(St)


    // 14. Make a variable and set it to the length of the string from 13 such that if
    // the string is null, the variable will be -1, then print the length.
    val length = String?.length ?: -1
    println(length)

    // 15. Write a when statement that returns a string saying if the string
    // is empty, the string is short, the string is medium length, or the string
    // is long. It's up to you as to what short, medium, and long strings are.
    val size = when {
    String.isNullOrEmpty() -> "The string is empty"
    String.length < 5 -> "The string is short"
    eString.length < 10 -> "The string is medium length"
    else -> "The string is long"
}
println(size)

}
