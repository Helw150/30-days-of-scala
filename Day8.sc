object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- n-1 to 0 by -1) {
      arr(arr_i) = sc.nextInt();
    }
    for(arr_reverse <- arr){
      print(arr_reverse + " ")
    }
  }
}
