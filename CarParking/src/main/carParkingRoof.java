package main;

import java.util.Arrays;
import java.util.Scanner;

public class carParkingRoof {

	
	 	// the parking spots where cars are parked
	public static  int k=4; 							//the number of cars that have to be covered by the roof
	public static  int roofLength; 						// the minimum length of a roof to be calculated that can cover k cars
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
System.out.print("Enter number of cars in the parking: ");
int n=in.nextInt();
  int[] cars=new int[n];
System.out.println("Enter parked car indexs:");
for (int i = 0; i < n; i++) {
	System.out.print("cars["+i+"]=");
    cars[i] = in.nextInt();	
}

System.out.print("Enter the min count of cars under the roof: ");
int k=in.nextInt();

		int boofer=0;
		Arrays.sort(cars);  							// Sort the spots of cars
		roofLength=cars[cars.length-1]; 							//Define max value for roof length
		
		for (int i = 0; i < cars.length-k+1; i++) {
			boofer=cars[i+k-1]-cars[i]+1;
			
			if (boofer<=roofLength) {              		//Find min length for roof which can keep at least k number cars
				roofLength=boofer;
				System.out.println(i+k-1+" i+k-1 "+cars[i+k-1]+" "+i+" i "+cars[i]+" rr "+roofLength);
			}
		}
		if (roofLength<k) roofLength=k;
		
		System.out.println();
		System.out.println("The shortest roof that meets the requirement is of length: "+roofLength);    				// print the result
	}

}
