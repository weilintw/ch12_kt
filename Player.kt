/*c12-11*/
class Player {
    var name = "wl"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }
    fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}