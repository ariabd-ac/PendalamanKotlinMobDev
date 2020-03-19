open class Person(){
    fun makan()= println("makan indomi")
    fun minum()= println("minum soda")
    open fun doa()= println("baca doa dulu tapi")
}

fun main(){
    val muslim = object : Person(){
        override fun doa() = println("Bismillah")
    }

    muslim.makan()
    muslim.minum()
    muslim.doa()
}