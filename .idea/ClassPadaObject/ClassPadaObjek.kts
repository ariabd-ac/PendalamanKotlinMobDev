class Lampu{
    //data member
    private var isOn: Boolean = false
    //member function
    fun turnOn(){
        isOn = true
    }
    //member function
    fun turnOff(){
        isOn = false
    }
    fun displayLightStatus(lampu:String){
        if(isOn == true)
            println("$lampu lampu is On")
        else
            println("$lampu lampu is Off")
    }
}
fun main(args: Array<String>){
    val l1 = Lampu()//create l1 object Lampu class
    val l2 = Lampu()//create l2 object Lampu class
    l1.turnOn()
    l2.turnOff()
    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}