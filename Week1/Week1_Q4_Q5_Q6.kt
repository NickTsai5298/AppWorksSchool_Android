/* #Q.4
class Human () {

    fun attack(name:String):String {
        return "$name use First Attack!"
    }

}

fun main(args: Array<String>) {

    println(Human().attack("Nick"))

}

 */


/* #Q.5
open class Human () {

    open fun attack(name:String):String {
        return "$name use First Attack!"
    }

}

open class Mage: Human() {
    override fun attack(name: String): String {
        return "$name use Fireball!!!"
    }
}

fun main(args: Array<String>) {

    println(Mage().attack("Nick"))

}

 */

//Q.6
open class Human () {

    open fun attack(name:String,mana:String?=null):String {
        return "$name use First Attack!"
    }

}

open class Mage: Human() {
    override fun attack(name: String,mana: String?): String {
        if (mana != null){
            return "$name use Fireball!!! Mana Attack!!!"
        } else {
            return "$name use Fireball!!! No Mana Attack!!!"
        }


    }
}

fun main(args: Array<String>) {

    println(Mage().attack("Nick"))

    println(Mage().attack("Nick","yes"))

}