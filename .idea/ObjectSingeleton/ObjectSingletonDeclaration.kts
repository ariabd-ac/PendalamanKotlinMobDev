object Test{
    private var a: Int = 0
    var b: Int = 1

    fun hallo(): Int{
        a = 12
        return a
    }
}

fun main(){
    val hasil : Int
    hasil = Test.hallo()

    println("b  = ${Test.b}")
    println("Hasil = $hasil")
}