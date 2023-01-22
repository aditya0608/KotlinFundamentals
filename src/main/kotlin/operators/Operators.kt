package operators

fun main() {
    var number = 5
    var anotherNumber = 4

    val result = number + anotherNumber
    println("Result $result")
    //or use placeholders ${expression which results one result}
    //BINARY OPERATORS
    //ACT ON TWO OPERANDS HERE BETWEEN number and anotherNumber
    println("Result + ${number + anotherNumber}")
    println("Result - ${number - anotherNumber}")
    println("Result * ${number * anotherNumber}")
    println("Result / ${number / anotherNumber}")
    println("Result % ${number % anotherNumber}")

    //OPERATOR PRECEDENCE

    println("3+3*4=${3 + 3 * 4}")
    println("(3+3)*4=${(3 + 3) * 4}")

    number = 0
    anotherNumber = 0
    //INCREMENT AND DECREMENT
    //UNARY OPERATORS i.e. Act on one operand here number,anotherNumber

    println("Pre increment ${++number}")
    println("Post increment ${anotherNumber++}")

    //IF ELSE STATEMENTS
    val isActive = true

    //isActive==true
    if (isActive)
        println("User is active ...")
    else
        println("User is inactive...")

    //IF ELSE-IF LADDER

    var age = 46

    if (age <= 19)
        println("User is Teenager")
    else if (age > 19 && age < 28)
        println("User is in youth ")
    else if (age > 28 && age < 40)
        println("User is eligible to marry :)")
    else
        println("User is a senior citizen")


}
