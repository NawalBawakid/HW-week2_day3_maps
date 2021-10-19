fun main(args: Array<String>) {
    // Part|
    // Create a map with 4 elements with add, edit and remove

    var names = mutableMapOf("Ahmed" to "Aldosari" , "Ali" to "Asiri" , "Najla" to "al zahrani" , "Anas" to "Al harbi")
    names.put("Nawal", "Bawakid")
    names["Nawal"] = "Khalid"
    names.remove("Ali")
    println(names)


    println("==========================================")

    // Part||
    // Create a map of 3 elemnts and create 3 elements of list add the list to the map

    var color = mutableMapOf("one" to "red", "two" to "green", "three" to "white")
    var newColor = listOf("black", "orange", "yalow")

    color.putAll(newColor.map { it to it })
    println(color)
}