import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    print("Введите координаты первой точки (x;y) ")
    val point1 = Point(readln().toInt(),readln().toInt())
    print("Введите координаты второй точки (x;y) ")
    val point2 = Point(readln().toInt(),readln().toInt())
    distancePoints(point1,point2)

}
fun distancePoints(point1:Point,point2:Point){
    println("Расстояние между точками: " + sqrt(Math.pow((point1.x-point2.x).toDouble(),2.0) + Math.pow((point1.y - point2.y).toDouble(),2.0)))

}