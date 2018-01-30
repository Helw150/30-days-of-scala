object Solution {

  def main(args: Array[String]) {
    // All odds are Weird
    def isEven(number: Int): Boolean = {
      if(number % 2 == 0) true else false
    }

    // Makes sure it isn't in the Weird Even Range
    def isValidRange(number: Int): Boolean = {
      if(!(6 <= number && number <= 20)) true else false
    }

    // Intentionally overcomplicated version of && to play with Higher-Order Functions
    def numberChecks(functions: Array[(Int) => Boolean], number: Int): Boolean = {
      val valid: Boolean = functions.forall(f => f(number));
      valid
    }

    val sc = new java.util.Scanner (System.in);
    var N = sc.nextInt();
    if(numberChecks(Array(isEven, isValidRange), N)) println("Not Weird") else println("Weird")
  }
}
