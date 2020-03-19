class Outer {

    val a = "Diluar dari Nested Class."

    inner class Inner{
        fun callMe() = a
    }
}

fun main (args:Array<String>){

    val outer = Outer()
    println("Menggunakan objek outer : ${outer.Inner().callMe()}")

    val inner = Outer.Inner
    println("Menggunakan objek inner : ${inner.callMe()}")
}