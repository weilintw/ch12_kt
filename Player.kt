/*c12-8*/
class Player {
    val name = "wl"
        get() = field.capitalize()
    private fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}