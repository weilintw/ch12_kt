/*c12-21*/
import java.lang.Math.pow
import java.lang.Math.random

fun main() {

    val player = Player()

    //Aura
    //val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = auraColor(karma)

    val healthStatus = formaHealthStatus(healthPoints, isBlessed)
    printPlayerStatus(healthPoints, karma, auraColor, isBlessed, player.name, healthStatus)

    //castFireBall(12)
    drunkenness(x=player.castFireBall(50))
}

private fun printPlayerStatus(
    healthPoints: Int,
    karma: Int,
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    val statusFormatString =
        "(健康指數: $healthPoints)(karma: $karma ，光環: $auraColor) (運勢: ${if (isBlessed) "走運" else "很背"}) -> $name $healthStatus"

    println(statusFormatString)
}

private fun drunkenness(x: Int) {
    val s = when (x) {
        in 41..50 -> "爛醉如泥"
        in 31..40 -> "大醉stewed"
        in 21..30 -> "醉了soused"
        in 11..20 -> "微醉sloshed"
        in 1..10 -> "微醺tipsy"
        0 -> "未喝酒"
        else -> "超出範圍"
    }
    println("醉酒程度：$s")
}