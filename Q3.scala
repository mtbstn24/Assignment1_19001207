object Q3 extends App{
  def coverCost(num:Double)=num*24.95;
  def calDiscount(price:Double,discount:Double)=price-((discount/100)*price);
  def ShippingCost(num:Double):Double={
    if(num<=50){
      3.0;
    }
    else{
      3+(num-50)*0.75;
    }
  }
  def TotalCost(x:Double):Double=calDiscount(coverCost(x),40)+ShippingCost(x);

  val Total = TotalCost(60.0);
  print("Total Wholesale Cost : ");
  println(f"$Total%1.2f");
}
