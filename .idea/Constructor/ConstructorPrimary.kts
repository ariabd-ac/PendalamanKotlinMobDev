fun main(args: Array<String>){
    val person1 = Person("viola",17)

    println("Nama Depan = $(person1.namaDepan)")
    println("Usia = ${person1.usia}")
}

class Person(val namaDepan: String, var usia:Int){

}