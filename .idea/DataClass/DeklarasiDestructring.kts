data class User(val nama: String, val umur: Int, val gender: String)

fun main(){
    val u1 = User("ari", 20, "Laki-Laki")

//    val (nama,umur,gender) = u1
//    println("Nama $nama")
//    println("Umur $umur")
//    println("gender $gender")

    println(u1.component1())
    println(u1.component2())
    println(u1.component3())

}