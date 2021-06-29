/*c12-9*/
class Player {
    val name = "wl"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }
    private fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}