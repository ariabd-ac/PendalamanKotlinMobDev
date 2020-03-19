abstract class Personal(nama : String){
    init {
        println("Nama saya adalah $nama.")
    }
    fun tampilkanSSN (ssn: Int){
        println("SSN saya adalah $ssn.")
    }
    abstract fun tampilkan(keterangan : String)
}

class Pengajar(nama: String):Personal(nama){
    override fun tampilkan(keterangan: String) {
        println(keterangan)
    }
}

fun main(args:Array<String>){
    val jek = Pengajar("Ari Abdurrahman Ghufron")
    jek.tampilkan("Saya Seorang FrontDev")
    jek.tampilkanSSN(17090125)
}