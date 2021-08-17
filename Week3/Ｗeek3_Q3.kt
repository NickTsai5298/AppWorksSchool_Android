/*
enum class Priority (val chineseName: String="",
                     val simpleExRate: Int=0) {

        MINOR,
        NORMAL("a",123),
        MAJOR,
        CRITICAL
}

fun main(args: Array<String>) {

        val priority = Priority.NORMAL
        val priority1 = Priority.NORMAL.name
        val priority2 = Priority.NORMAL.ordinal
        val priority3 = Priority.NORMAL.chineseName
        val priority4 = Priority.NORMAL.simpleExRate

        println(priority)
        println(priority1)
        println(priority2)
        println(priority3)
        println(priority4)
}
*/

/*
enum class Priority (val value: Int) {

        MINOR(-1),
        NORMAL(0),
        MAJOR(1),
        CRITICAL(10)

}


fun main(args: Array<String>) {

        val priority = Priority.NORMAL

        println(priority)
        println(priority.value)
        println(Priority.CRITICAL.name)

        for (priorityInlist in Priority.values()){
                println(priorityInlist)
        }

        val p = Priority.valueOf("MAJOR")
        println(p.ordinal)
}
 */
enum class Priority (val value: Int) {

        MINOR(-1){
                override fun text(): String {
                        return "[Minor Priority]"
                }
                override fun toString(): String {
                        return "[Minor Priority]"
                }
        },
        NORMAL(0) {
                override fun text(): String {
                        TODO("Not yet implemented")
                }
        };
        abstract fun text(): String
}

fun main(args: Array<String>) {

        val priority = Priority.MINOR

        println(priority.value) //priority
        println(priority.ordinal)

        println(priority.text())
        println(Priority.valueOf("NORMAL").ordinal) // "P"riority
}