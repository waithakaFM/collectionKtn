fun sayHello(greeting: String, itemsToGreet:List<String>) {
    itemsToGreet.forEach{itemToGreet -> println("$greeting $itemToGreet") }
}

fun arrays(){
    // declaring an array
    val interestingThings = arrayOf("Kotlin", "Python", "Java")

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(1))

    // printing elements in each element
    // the code enclosed in {} ia a lambda function
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    // to maintain the index of each element
    interestingThings.forEachIndexed{ index, interestingThing ->
        println("$interestingThing is at index $index")
    }

}

fun lists(){
    // Declaring lists -> they are immutable
    val animals = listOf<String>("Lion", "Rhino", "Elephant")
    // mutable list
    val pets = mutableListOf<String>("Cats", "Dog", "Pig")
    pets.add("Snakes")

    // list functions are like those of array
    animals.forEach{
        println(it)
    }

    pets.forEachIndexed{index, pet -> println("$pet is in index $index") }
}

fun maps(){
    // takes in pairs, key and value, they are immutable
    val map = mapOf<String, String>("Mon" to "Monday", "Tue" to "Tuesday", "Wen" to "Wednesday", "Thur" to "Thursday" )
    map.forEach{ (key, value) -> println("$key -> $value") }

    // mutable maps
    val months = mutableMapOf<Int, String>(1 to "January", 2 to "February", 3 to "March", 4 to "April")
    months.put(5 ,"May")
    months[6] = "June"

    months.forEach{ (key, value) -> println("$key -> $value") }

}

fun main() {
    arrays()
    lists()
    maps()
    val animals = listOf<String>("Lion", "Rhino", "Elephant")
    sayHello(greeting = "Hi", animals)
}