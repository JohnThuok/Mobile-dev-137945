package example.myapp

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }
    /*fun buildAquarium() {
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
    }*/
    fun buildAquarium() {
        val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
        aquarium6.printSize()
    }
    fun Main (args: Array<String>) {
        val aquarium = Aquarium()
        aquarium.buildAquarium()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    companion object {
        fun printSize(aquarium: Aquarium) {
            println(aquarium.shape)
            println("Width: ${aquarium.width} cm " +
                    "Length: ${aquarium.length} cm " +
                    "Height: ${aquarium.height} cm ")
            // 1 l = 1000 cm^3
            println("Volume: $volume liters Water: ${aquarium.water} liters (${aquarium.water / volume * 100.0}% full)")
        }
    }
}