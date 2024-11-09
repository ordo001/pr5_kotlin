fun main(args: Array<String>) {
    println("Введите координаты первой вершины (A):")
    val A = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    println("Введите координаты второй вершины (B):")
    val B = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    println("Введите координаты третьей вершины (C):")
    val C = Point(readLine()!!.toDouble(), readLine()!!.toDouble())

    val triangle = Triangle(A, B, C)

    val circumcenter = triangle.centerOkr()

    println("Центр описанной окружности: ( " + circumcenter.x + circumcenter.y + " )")
}