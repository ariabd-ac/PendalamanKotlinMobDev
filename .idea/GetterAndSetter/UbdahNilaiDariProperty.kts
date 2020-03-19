fun main(){
    val cewe = Girl()
    cewe.umurAsli = 15
    cewe.umurPalsu = 15
    println("Cewe: UmurAsli = ${cewe.umurAsli}")
    println("Cewe: UmurPalsu = ${cewe.umurPalsu}")
    val siti = Girl()
    siti.umurAsli = 35
    siti.umurPalsu = 35
    println("Siti: umurAsli = ${siti.umurAsli}")
    println("Siti: umurPalsu = ${siti.umurPalsu}")
}
class Girl{
    var umurPalsu: Int = 0
        get() = field
        set(value){
            field = if (value < 18)
                18
            else if(value>18 && value<=30)
                value
            else
                value-3
        }
    var umurAsli: Int = 0
}