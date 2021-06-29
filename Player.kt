/*c12-20*/
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
    private fun auraColor()=
        when (karma) {
            in (0..5) -> "紅色"
            in (6..10) -> "橘黃色"
            in (11..15) -> "紫色"
            in (16..20) -> "綠色"
            else -> "無光環"
        }

    private fun formaHealthStatus() =
        when (healthPoints) {
            100 -> "健康狀態極佳"
            in 90..99 -> "有一些小擦傷"
            in 75..89 -> if (isBlessed) {
                "雖有一些傷口，但恢復很快"
            } else {
                "有一些傷口"
            }
            in 15..74 -> "嚴重受傷"
            //顯示玩家狀態
            else -> "情況不妙"
        }
}