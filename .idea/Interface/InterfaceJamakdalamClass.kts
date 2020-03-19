interface A{
    fun callMe(){
        println("dariInterface A")
    }
}
interface B{
    fun callMeToo(){
        println("dari interface B")
    }
}

class Anakan: A, B
fun main(){
    val obj=Anakan()

    obj.callMe()
    obj.callMeToo()
}