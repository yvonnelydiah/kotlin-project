package OOP

import java.awt.datatransfer.ClipboardOwner

class Vehicle (owner:String, colour:String, brand:String, wheels:Int){

    //initialize our class
    init {
        println("The owner of the vehicle is $owner")
        println("The colour of the colour is $colour")
        println("The brand of the colour is $brand")
        println("The vehicle has $wheels wheels")
    }
}

fun main(args: Array<String>) {
    var owner_one = Vehicle("Philo","silver","toyota",4)
    println("____End of Vehicle 1____")
    var owner_two = Vehicle("lydiah","maroon","Wish",4)
    println("____End of Vehicle 2____")
    var owner_three = Vehicle("purity","grey","filder",4)
    println("____End of Vehicle 3____")






}