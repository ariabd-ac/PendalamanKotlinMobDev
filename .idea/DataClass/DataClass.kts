data class User(val nama: String, val umur: Int)

fun main(){
    val ari = User("ari", 20)
    println("Nama = ${ari.nama}")
    println("Umur = ${ari.umur}")
}