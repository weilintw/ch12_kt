/*c12-10*/
class Player {
    var name = "wl"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }
    private fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}