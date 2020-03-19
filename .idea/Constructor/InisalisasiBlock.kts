fun main(args: Array <String>){
    val person = Person("viola", 15)
}

class Person(nama : String, umurPerson: Int){
    val namaDepan: String
    var umur: Int

    //initialisasi block
    init{
        namaDepan = nama.capitalize()
        umur = umurPerson

        println("nama Depan = $namaDepan")
        println("Umur = $umur")
    }
}