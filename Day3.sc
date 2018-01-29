object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var meal_cost = sc.nextDouble();
    var tip_percent = sc.nextInt();
    var tax_percent = sc.nextInt();
    val tip: Double = percentageCalc(meal_cost, tip_percent)
    val tax: Double = percentageCalc(meal_cost, tax_percent)
    val total_cost: Int = (meal_cost + tip + tax).asInstanceOf[Int]
    println("The total meal cost is " + total_cost + " dollars.")
  }

  def percentageCalc(base: Double, percentage: Int): Double = {
    val truePercentage: Double = percentage / 100.0;
    val valueFromBase: Double = truePercentage * base;
    valueFromBase
  }
}
