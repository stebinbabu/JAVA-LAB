package graphics;
import java.util.*;
public class circle implements area_cal{
	double r,area=0;
	public void area(){
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the radius");
		r=Sc.nextDouble();
		// String area= Double.toString(Math.PI*r*r);
		area=pi*(r*r);
		System.out.println("area of the circle is : "+area);
	}
}	
