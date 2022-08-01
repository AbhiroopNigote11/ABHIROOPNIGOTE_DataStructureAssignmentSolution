package com.abhi.main;


public class Service {
	public void orderedconst(int numberOfFloors,int[] floorSizeArray) {
		System.out.println("The ordered construction is as follows :");

		int m = numberOfFloors;
		for(int i = 0; i<m ; i++) {
			if(floorSizeArray[i] < numberOfFloors) {
				System.out.println("Day " +(i+1)+ ":");
			}
			if (floorSizeArray[i] == numberOfFloors) {
				System.out.println("Day " +(i+1)+ ":" +numberOfFloors);

				if(numberOfFloors - floorSizeArray[i-1] >1) {
					numberOfFloors = numberOfFloors - 1;
					continue;
				}for(int j = (i-1); j>=0 ; j--) {
					for(int k=0 ; k<=j+1 ; k++) {
						if(floorSizeArray[j] == numberOfFloors - k) {
							System.out.println(floorSizeArray[j]);
							numberOfFloors = numberOfFloors - (k+1);
							break;
						}
					}
				}
			}
		}
	}
}

