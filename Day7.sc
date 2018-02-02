import scala.collection.mutable.ArrayBuffer

object Solution {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    sc.nextLine();
    for(i <- 0 to n){
      var name = sc.nextLine();
      var array = name.split("");
      printEvensAndOdds(array);
    }
  }

  def printEvensAndOdds(str_array: Array[String]){
    val evens =  ArrayBuffer[String]()
    val odds =  ArrayBuffer[String]()
    for(index <- str_array.indices){
      if(index%2 == 0){
        evens.append(str_array(index))
      } else {
        odds.append(str_array(index))
      }
    }
    println(evens.toArray.mkString("") + " " + odds.toArray.mkString(""))
  }
}
