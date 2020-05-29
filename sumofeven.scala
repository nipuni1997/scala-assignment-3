
object sumofeven {

  def sumofeven(n: Int): Int = {
    var current = 2
    var sum = 0

    for (i <- 1 to n) {
      sum += current

      current += 2
    }

    sum
  }


  def main(argc: Array[String]): Unit = {
    println("Enter any number:")
    val number = readInt()
    println("Sum of first even numbers: " + sumofeven(number))
  }
}
