object prime1{
  def main(args: Array[String]): Unit = {

    var x = 0


    println("Enter any number:")
    val number = readInt()
    val obj = new Prime
    x = obj.prime(number, 2)
    if (x == 1) println(number + " is prime number")
    else println(number + " is not prime number")
  }
}

class Prime {



  def prime(y: Int, i: Int): Int = {
    if (i < y) {
      if (y % i != 0) {
        return (prime(y,i+1))
      }
    }
    else return 0
    1
  }
}