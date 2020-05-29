

object prime2 {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) return false

    for (i <- 2 until n) {
      if (n % i == 0) return false
    }
    true
  }


  def printPrime(n: Int): Unit = {
    for (i <- 2 to n) {
      if (isPrime(i)) System.out.print(i + " ")
    }
  }


  def main(args: Array[String]): Unit = {
    println("Enter any number:")
    val number = readInt()
    printPrime(number)
  }
}