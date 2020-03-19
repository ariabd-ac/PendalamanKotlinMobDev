fun main(args: Array<String>){
    val p1 = AuthLog("Password")
}
open class Log{
    var data:String = ""
    var numberOfData = 0

    constructor(data1:String){

    }
    constructor(data1: String, numberOfData1: Int){
        data = data1
        numberOfData = numberOfData1
        println("$data: $numberOfData X")
    }
}
class AuthLog: Log{
    constructor(data1:String): this("Dari AuthLog ->" +data1, 10){

    }
    constructor(data1: String, numberOfData1: Int): super(data1, numberOfData1){

    }
}