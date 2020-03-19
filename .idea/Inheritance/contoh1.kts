open class Personal(umur: Int, nama: String){
    init{
        println("Nama Saya adalah $nama.")
        println("Nama Saya adalah $nama.")
    }
}
class GuruMatematika(umur: Int, nama: String): Personal(umur, nama){
    fun mengajar(){
        println("Sata mengajar di kelas SD.")
    }
}
class PersepakBola(umur: Int, nama: String): Personal(umur, nama){
    fun bermain(){
        println("Saya bermain untuk Persela.")

    }
}
fun main(args: Array<String>){
    val t1 = GuruMatematika(25, "Ridha")
    t1.mengajar()
    println()
    val f1 = PersepakBola(29, "Rafi")
    f1.bermain()
}