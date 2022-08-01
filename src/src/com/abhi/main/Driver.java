package com.abhi.main;


import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {  
		int numberOfFloors;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("enter the total no of floors in the building ");
	      numberOfFloors = sc.nextInt();

	      Service floors = new Service();
	      int[] floorSizeArray = new int[numberOfFloors];
	      for(int i=0; i<numberOfFloors; i++) {
	    	  System.out.println("enter the floor size given on day " +(i+1)+ ":");
	    	  floorSizeArray[i] = sc.nextInt();
	      }
	      floors.orderedconst(numberOfFloors , floorSizeArray);
	      sc.close();
		}
}