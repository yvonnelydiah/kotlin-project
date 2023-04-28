package OOP

class House (owner:String, location:String, price:Int, doors:Int){

    //initialize our class
    init {
        println("Owner of the house is $owner")
        println("House is located in $location")
        println("House coast $price")
        println("House has $doors number of doors")

    }
}

fun main(args: Array<String>) {
    var owner_one = House("Philo","Egerton", 250000,8)
    println("____End of house 1____")
    var owner_two = House("Lydiah","Westie", 400000,10)
    println("____End of house 2____")
    var owner_three = House("Augostine","Kericho", 800000,12)
    println("____End of house 3____")




}