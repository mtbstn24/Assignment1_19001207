object Q2 extends App{
  def svol(r:Double)=(4.0/3.0)*math.Pi*r*r*r;

  val vol = svol(5);
  println("Volume of Sphere with radius 5 : ");
  println(f"$vol%1.2f");
}
