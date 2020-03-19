interface InterfaceKu{
    // Property dengan Implementasi
    val prop: Int
        get() = 23
}

class ImplementasiInterface: InterfaceKu{
    //class body
}

fun main(){
    val obj = ImplementasiInterface()
    println(obj.prop)
}