package starter

fun main()
{
    //CAN CHANGE THE VALUE OF VARIABLE var
    var userName:String="ADITYA"
    //userName="CHANGED MYSELF NOW "

    //CONSTANT VALUE
    val constantUserName:String="ADITYA"
    //THIS LINE GIVES AN ERROR AS THE VARIABLE IS CONSTANT
    //constantUserName="CHANGED MYSELF NOW "

    //INTEGER

    var age:Int=26

    //BOOLEAN

    var isVegetarian:Boolean=true

    //TYPE INFERENCE IS THERE SO DECLARATION IS NOT REQUIRED

    var inferedUserName="ADITYA"
    println("Hello my name is $userName " +
            "my age is $age " +
            "and i am i vegan:$isVegetarian\n" +
            "My inferred userName is $inferedUserName"
    )
}