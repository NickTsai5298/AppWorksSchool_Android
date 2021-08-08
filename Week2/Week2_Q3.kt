
fun main(args: Array<String>) {
    val score_card = listOf(Pair("John", "60"),Pair("Nick", "80"))

    for (i in score_card) {
        println(i)
    }
}



/*
fun capitalAndPopulation(country:String): Pair<String,Long>{
    return Pair("TPE",20000)
}
fun countryInfo(country:String): Triple<String,String,Long>{
    return Triple("TPE","Asia",20000)
}


fun main(args: Array<String>) {

    val result = capitalAndPopulation("TPE")

    val result2 = countryInfo("TE")

    val (capital,population) = capitalAndPopulation("T")

    val (capital99,country99,population99) = countryInfo("T")


    println(capital99)
    println(country99)
    println(population99)

    val (id,name,email) = CustomerKotlin(1,"Nick","email")
    println(id)
    println(name)
    println(email)

    val listCapitalAndCountry = listOf(Pair("TPE","NTPE"),"Paris" to "France")

    for((capital299,country299) in listCapitalAndCountry){
        println(capital299)
        println(country299)
    }

}

 */