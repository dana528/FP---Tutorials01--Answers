// Q 04
object q04{
  def main(args:Array[String])
  {
     var normal_hour_rate : Double = 250; 
     var ot_hour_rate : Double =85;
     var normal_h : Double = 40;
     var ot_h : Double = 30;

     var full_salary :Double =( (normal_hour_rate*normal_h) + (ot_hour_rate*ot_h)) * 4;
     var tax : Double = full_salary*0.12;
     var take_home_salary : Double = full_salary - tax;


     println("Take home  salary = Rs."); 
     println(take_home_salary);

  }
}
