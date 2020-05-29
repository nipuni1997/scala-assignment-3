object  evenOdd {
  def main(args: Array[String]): Unit = {
    println("Enter any number:")
    val number = readInt()
    evenOdd(number)
  }
  def evenOdd(n: Int): Unit = {
    if(n%2==0){
      println("Number is even")
    }else{
      println("Number is odd")
    }
  }

}
