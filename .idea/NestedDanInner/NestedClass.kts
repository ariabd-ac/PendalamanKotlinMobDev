class Outer {
    val a = "Diluar Nested Class."
    class Nested{
        val b = "Di dalam Nested Class"
        fun callMe() = "Function akan dipanggil di dalam Nested Class."
    }
}

fun main (args:Array<String>){
//    Pengaksesan anggota dari nested class
    println(Outer.Nested().b)

//    pembuatan objek dari Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}