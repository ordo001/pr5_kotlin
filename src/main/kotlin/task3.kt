import kotlin.math.pow
import kotlin.math.sqrt
fun main(args: Array<String>) {
    val x1 = 0.0
    val y1 = 0.0
    val x2 = 2
    val y2 = 5
    val x3 = 10.0
    val y3 = 0.0
    val denominator = 2 * (x1 * (y2 - y3) + x2 * (y3- y1) + x3 * (y1-y2))

    if (denominator == 0.0 ) {
        println("Точки находятся на одной прямой. Окружности нет")
    }

    val cx = ((x1 * x1 + y1 * y1) * (y2 - y3) +
              (x2 * x2 + y2 * y2) * (y3 - y1) +
              (x3 * x3 + y3 * y3) * (y1 - y2)) / denominator

    val cy = ((x1 * x1 + y1 * y1) * (x3 - x2) +
            (x2 * x2 + y2 * y2) * (x1 - x3) +
            (x3 * x3 + y3 * y3) * (x2 - x1)) / denominator

    val R = sqrt((cx - x1) * (cx - x1) + (cy - y1) * (cy - y1)).toDouble()

    println("Координаты центра описанной вокруг тругольника окружности: " + cx + "," + cy)
    println("Радиус описанной окружности: " + R)
}