//Question 01,02

object q01_02{
  //main method
  def main(args:Array[String])
  {
    var k = 2;var i = 2;var j=2;
    var m = 5;var n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X';

    // expression  evaluate
    var a = k+12*m;
    var b:Double = m/j;
    var p = n%j;
    var d:Double = m/j*j;
    var e = f+10*5+g;
    //var q = ++i *5; There will be an error with this increment and operator.Because Scala has no ++ and -- operators. 
   // we can use binary operators instead of this unary  operators.
   // therefore,
    var q = (i+1)*5;



    println(a);
    println(b);
    println(p);
    println(d);
    println(e);
    println(q);
  }
}
