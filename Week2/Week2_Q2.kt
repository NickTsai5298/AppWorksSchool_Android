// Split to List

fun String.toSplit():List<String>{

    // split -> change the splited item into a string with " " in between then capitilize
    return this.split(" ")
}

fun main(args: Array<String>) {
    println("this is a sample string to title case".toSplit())
}



// Split to String
/*
fun String.splittoString():String{
    // split -> change each of the splited item to capitilize then combine into a string
    return this.split(" ").joinToString(" ")
}

fun main(args: Array<String>) {
    println("this is a sample string to title case".splittoString())
}

 */