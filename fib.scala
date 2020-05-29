object fib {
  def Fibonacci(n: Int): Unit = {
    var x = 0
    var y = 1
    var i = 0
    if (n < 1) return
    i = 1
    while ( {
      i <= n
    }) {
      println(y + " ")
      val nextNumber = x + y
      x = y
      y = nextNumber

      i += 1
    }
  }


  def main(args: Array[String]): Unit = {
    println("Enter any number:")
    val number = readInt()
    Fibonacci(number)
  }
}