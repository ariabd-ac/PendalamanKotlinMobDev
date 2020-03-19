class Person{
    companion object{
        fun callMe() = println("Saya dipanggil")
    }
}

fun main(){
    Person.callMe()
}