interface A{
    fun callMe(){
        println("dariInterface A")
    }
}
interface B{
    fun callMe(){
        println("dari interface B")
    }
}

class C: A, B{
    override fun callMe(){
        super<A>.callMe()
        super<B>.callMe()
    }
}
fun main(){
    val obj=C()
    obj.callMe()
}