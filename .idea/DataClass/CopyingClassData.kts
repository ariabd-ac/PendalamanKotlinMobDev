data class User(val nama: String, val umur: Int)

fun main(){
    val u1 = User("ari", 20)

//    membuat function copying
    val u2 = u1.copy(nama="Ardi")
    println("u1 : nama = ${u1.nama}, nama = ${u1.umur}")
    println("u2 : nama = ${u2.nama}, nama = ${u2.umur}")
}