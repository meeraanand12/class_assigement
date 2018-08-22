package com.apex.util;
import java.util.*;

public class Assigement1 {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of hours worked");
		double hours =sc.nextDouble();
		
	    System.out.println("Enter payrate value per hour");
	    double payRate = sc.nextDouble();
	    
	    double payRate_monthly = hours * payRate;
	    System.out.println("No of hours worked " + hours);
	    System.out.println("payRate per hour " + payRate);
	    System.out.println("pay rate monthly " + payRate_monthly);
	    sc.close();
		
		
	}

}
 