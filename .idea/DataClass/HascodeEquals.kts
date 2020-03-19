data class User(val nama: String, val umur: Int)

fun main(){
    val u1 = User("ari", 20)
    val u2 = u1.copy()
    val u3 = u1.copy(nama = "Andri")

    println("u1 hasCode = $hashCode()}")
    println("u2 hasCode = $hashCode()}")
    println("u3 hasCode = $hashCode()}")

    if (u1.equals(u2) == true)
        println("u1 sama dengan u2.")
    else
        println("u1 tidak sama dengan u2.")

    if (u1.equals(u3) == true)
        println("u1 sama dengan u2")
    else
        println("u1 tidak sama dengan u2")

}