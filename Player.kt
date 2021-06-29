/*c12-15*/
class Player {
    var name = "wl"
        get() = field.capitalize()
        private set(value){
            field = value.trim()
        }

    fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}