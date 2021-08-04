
//#Q.4 -OK
class Human(var Name: String){



    fun attack(): String {
        return "$Name use First Attack!"
    }

}
fun main(args: Array<String>) {

    val result = Human("Nick")

    println(result.attack())

}

/*#Q.5-OK
open class Human(var Name: String){



    open fun attack(): String {
        return "$Name use First Attack!"
    }

}

class Mage(Name: String) : Human(Name) {
    override fun attack(): String {
        return "$Name use Fireball!!!"
    }
}

fun main(args: Array<String>) {

    val result = Mage("Nick")

    println(result.attack())

}

// #Q.6 - OK1
/*
open class Human(var Name: String,var mana: String?=null){



    open fun attack(): String {
        return "$Name use First Attack!"
    }

}

class Mage(Name: String,mana: String?) : Human(Name, mana) {
    override fun attack(): String {

        if (mana != "No"){
            return "$Name use Fireball!!! Mana Attack!!!"
        } else {
            return "$Name use Fireball!!! No Mana Attack!!!"
        }
    }
}

fun main(args: Array<String>) {

    val result = Mage("Nick","No")

    println(result.attack())

}

 */