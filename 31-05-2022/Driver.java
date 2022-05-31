import graphics.*;

import java.util.*;
public class Driver{
public static void main(String [] args){
	Scanner Sc =new Scanner(System.in);
	int choice;
	area_cal obj1 = new circle();
	area_cal obj2= new rectangle();
	area_cal obj3 = new square();
	area_cal obj4= new triangle();
	while(true){
		System.out.println("enter the option 1)circle, 2)rectangle, 3)square, 4)triangle"); 
		choice = Sc.nextInt();
		switch(choice) {
			case 1:
			obj1.area();
			break;
			case 2:
			obj2.area();
			break;
			case 3:
			obj3.area();
			break;
			case 4:
			obj4.area();
			break;
			case 0: System.exit(0);
			default:System.out.println("invalid opt");
				break;
			
			}
	}
	}
 }
	