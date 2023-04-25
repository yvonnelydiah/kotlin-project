fun main(args: Array<String>) {
    println("select option")
    var option = readln()!!.toInt()

    when(option) {
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No Expiry")

    }
}