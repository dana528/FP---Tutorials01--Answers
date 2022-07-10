//Q 03
object q03{
  def main(args:Array[String])
  {
    var a : Int=2; var b : Int=3; var c : Int=4; var d : Int=5;
    var k : Double =4.3f;
    

//  scala has no support unary operators
//    var x1= (--b)*(a+c)*(d--);
    var x1= (b-1)*a + c*d; // b-=1,Normally when use this d-- operator d value will decrease but (lets take,x= (d--)) x  will not display new value of d.Therfore i got d value d = 5  

//  var x2= (a++); This a++ doesn't support so,
    var x2= a; // a++ a will not increase     

//  var x3:Double= (-2*(g-k)+c); There is no value for g.

//  var x4=(c = c++); here also used binary operator instead of unary
    var x4= c; //c += 1,Therefore c value is not changed here

//  var x5= (c=(c++) *(a++)); 
    var x5= (c+1) * a;  // c += 1

    println(x1);
    println(x2);
//  println(x3);
    println(x4);
    println(x5);

  }
}
