import java.util.ArrayList;

/*
 * author: Thais Campanac-Climent
 * 
 * Problem: A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit 
 * numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 
 * 3-digit numbers.
 * 
 * How I want to solve it : I want to use functions during this problem so I need a function that checks
 * the number then I need a function that checks for the max number between the old and new number
 */

public class problemFour {
	
	//this function checks for the max number
	static int maxNum(int original, int number) {
		if(original>number) {
			return original;
		}
		return number;
	}
	
	//this function checks if it is a parlindromeNum
	static boolean parlindromeNum(int number) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		//the numbers start at 
		for(int y = 0; y<5; y++) {
			digits.add(number%10);
			number = number/10;
		}
		
		//I need to make another loop to find out if it is a 5 or 6 digit number
		int sum = 0;
		for(int x = 0; x< digits.size();x++) {
			sum = digits.get(x) + sum;
			//System.out.println(digits.get(x));
		}
		
		if(number - sum != 0) {
			digits.add(number%10);
		}
		
		for(int z = 0; z<digits.size()/2; z++) {
			if(digits.get(z)!= digits.get(digits.size()-1-z)) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		int maxNum = 0;
		for(int x = 100 ; x<=999; x++) {
			for(int y = 999; y>=100; y--) {
				int newNum= (y*x);
				//System.out.println(newNum);
				if(parlindromeNum(newNum)) {
					maxNum = maxNum(maxNum, newNum);
				}
			}
		}

		System.out.println("The max number for 3-digit integer parlindrome number is "+ maxNum);
	}

}
