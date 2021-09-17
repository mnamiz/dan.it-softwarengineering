package main;

import java.util.Arrays;

public class carParkingRoof {

	
	public static   int n=4; 							// the count of cars
	public static  int[] cars=new int[] {6,12,2,7}; 	// the parking spots where cars are parked
	public static  int k=3; 							//the number of cars that have to be covered by the roof
	public static  int roofLength; 						// the minimum length of a roof to be calculated that can cover k cars
	 
	public static void main(String[] args) {

		int boofer=0;
		Arrays.sort(cars);  							// Sort the spots of cars
		roofLength=cars[3]; 							//Define max value for roof length
		for (int i = 0; i < cars.length-k+1; i++) {
			boofer=cars[i+k-1]-cars[i]+1;
			
			if (boofer<=roofLength) {              		//Find min length for roof which can keepat least k number cars
				roofLength=boofer;
			}
			
		}
		
		System.out.println();
		System.out.println("The shortest roof that meets the requirement is of length: "+roofLength);    				// print the result
	}

}
