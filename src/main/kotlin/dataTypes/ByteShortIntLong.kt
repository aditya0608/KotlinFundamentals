package dataTypes

fun main()
{
    //BYTE
    var maxByteValue:Byte=Byte.MAX_VALUE

    //SHORT
    var maxShortValue:Short= Short.MAX_VALUE

    //INT
    var maxIntValue:Int= Int.MAX_VALUE
    //beyond max value for int it can't be assigned in Integer data type
    //maxIntValue=2147483648

    //LONG
    var maxLongValue:Long=Long.MAX_VALUE

    println("Max byte value $maxByteValue\n" +
            "Max short value $maxShortValue\n" +
            "Max int value $maxIntValue\n" +
            "Max long value $maxLongValue")

    //by default int is assigned if value is int limit
    //for byte short long declare explicit
    val myNumber=28

    val longNumber=28L

    //type automatically inferred to long as value is outside int limit
    val valueOutsideInt=237847847467467464


}