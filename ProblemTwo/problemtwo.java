/*author: Thais Campanac-Climent
 * Message from Author: This is the second problem on Project Euler
 * 
 * Problem: Each new term in the Fibonacci sequence is generated by 
 * adding the previous two terms. By starting with 1 and 2, the first 
 * 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do 
 * not exceed four million, find the sum of the even-valued terms.
 * 
 */
import java.io.*; 
import java.util.ArrayList;

public class problemtwo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//It errors on the end of the  constructor of the ArrayList
		ArrayList<Integer> startingNumber = new ArrayList<Integer> ();
		startingNumber.add(1);
		startingNumber.add(2);
		int sumOfEven = 0;
		int fibNumber = 0;
		
		for(int x= 0; x<=4000000; x++) {
			if(x==0) {
				fibNumber = startingNumber.get(x) + startingNumber.get(x+1);
				startingNumber.add(fibNumber);
			}
			else if(x==1) {
				fibNumber = fibNumber + startingNumber.get(x-1);
				startingNumber.add(fibNumber);
			}
			if(fibNumber%2==0) {
				sumOfEven += fibNumber;
			}
		}
		System.out.println("The sum of the even numbers are " + sumOfEven);

	}

}
