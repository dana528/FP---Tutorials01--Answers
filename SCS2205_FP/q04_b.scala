object q04_b{

  def main(args:Array[String]){

    def attendence(price:Int):Int = 120 + (15-price)/ 5*20;

    def revenue(price:Int) : Int = attendence(price) * price;

    def cost(price:Int) : Int = 500 + 3* attendence(price);

    def profit(price:Int) : Int = revenue(price) - cost(price);

    print("Enter Ticket Price:-");
    var p =  scala.io.StdIn.readInt();
    print("Profit = ");
    println(profit(p));

  }
























}
