package OOP

class Animals (colour:String, category:String, age:Int, legs:Int){

    //initialize our class

    init {
        println("Colour of the animal is $colour")
        println("Category of the animal is $category")
        println("Age of the animal is $age")
        println("The legs the animal are $legs")

    }
}

class Dog() {
     fun woof(){
         println("The dog Barks")

     }
}
class Cat() :Animals {
     fun meow() {
         println("The cat meows")
     }
}