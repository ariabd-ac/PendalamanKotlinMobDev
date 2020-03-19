fun main(){
    val p = Person()
    p.nama = "Viola"
    println("${p.nama}")
}
class Person{
    var nama: String = "defaultValue"
        get()=field
        set(value){
            field = value
        }
}