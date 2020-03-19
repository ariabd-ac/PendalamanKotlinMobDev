interface MyInterface{
    val test : Int
    fun hai(): String
    fun hello(){
        println("Hello Semua!!!")
    }
}

class InterfaceImp: MyInterface{
    override val test: Int = 25
    override fun hai()="hai semua!!"
}
fun main(){
    val obj = InterfaceImp()
    println("test=${obj.test}")
    println("panggil hallo:")

    obj.hello()
    println("Panggil dan print hai:")
    println(obj.hai())
}