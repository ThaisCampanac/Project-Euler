/*
 * author: Thais Campanac-Climent
 * 
 * Problem: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600,851,475,143 ?
 * 
 * Note: Prime Numbers can only be divided by 1 or itself, never by any other number
 */
public class problemThree {

	public static void main(String[] args) {
		System.out.print("The factors of 600851475143 are ");
		for(int x= 1; x<= 600851475143L; x++) {
			if(600851475143L%x==0) {
				if(x/2 != 0 && x/3 != 0 && x/4 != 0 && x/5 != 0 && x/6 != 0 && x/7 != 0 && x/8 != 0 && x/9 != 0)
				System.out.print(x+", ");
			}
		}
	}
}
