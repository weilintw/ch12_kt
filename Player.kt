/*c12-18*/
class Player {
    var name = "wl"
        get() = field.capitalize()
        private set(value){
            field = value.trim()
        }
    val healthPoints = 49
    private val isBlessed = true
    //val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *20).toInt()

    fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}