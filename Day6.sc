object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    showMultTable(n)
  }

  def multiplyAndPrint(base: Int, mod: Int) {
    var result = base * mod
    println(base + " x " + mod + " = " + result)
  }

  def showMultTable(base: Int){
    for(a <- 1 to 10){
      multiplyAndPrint(base, a)
    }
  }
}
