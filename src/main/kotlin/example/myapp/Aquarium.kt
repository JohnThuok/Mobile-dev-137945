package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    var length: Int = length
    var width: Int = width
    var height: Int = height
    fun buildAquarium() {
        val aquarium1 = Aquarium()
        aquarium1.printSize()
        // default height and length
        val aquarium2 = Aquarium(width = 25)
        aquarium2.printSize()
        // default width
        val aquarium3 = Aquarium(height = 35, length = 110)
        aquarium3.printSize()
        // everything custom
        val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
        aquarium4.printSize()
    }

    fun Main(args: Array<String>) {
        buildAquarium()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}