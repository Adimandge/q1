package Aditya;

import java.util.Scanner;

public class arrayexample {

	public static void main(String[] args) {
		 int a[]= new int[5];
	     Scanner s= new Scanner (System.in);
	     
	     for(int i=0;i<5;i++)
	     { System.out.println("enter number");
	    	 a[i]= s.nextInt();}
	      
	     for(int i=0;i<5;i++)
	    	{System.out.println (a[i]);}
	
	}

}
