class Outer{
	int x=10;
	 class Inner{
	 int y=5;
	 }
	
}
public class InnerClassExample{
 public static void main(String args[]){
   Outer obj1 = new Outer();
   Outer.Inner obj2= obj1.new Inner();
   System.out.println(obj2.y);
    System.out.println(obj1.x);
   
 }
}
