package example.myapp

class Main {
    private fun buildAquarium() {
        val myAquarium = Aquarium()
        myAquarium.run {

            printSize()
        }
    }

    fun Main (args: Array<String>){
        buildAquarium()
    }
}
