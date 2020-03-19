open class Personal(umur: Int, nama: String){
    //Beberapa Kode
}

class PersepakBola(umur: Int, nama: String, klub: String): Personal(umur, nama){
    init {
        println("Pemain Bola $nama umur $umur dan bermain untuk $klub.")

    }
    fun bermain(){
        println("Saya sedang bermain bola.")
    }
}
fun main(args: Array<String>){
    val t1 = PersepakBola(29, "Rafi", "PERSELA")

}