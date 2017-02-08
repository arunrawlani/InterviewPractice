package InterviewPractice;
/*
 *A program to count the number of bits set to 1 in an integer
 * 
 */

public class Q31_CountingBits {
	
	public static int numberOfBits(int i){
		short numBits = 0;
		while(i > 0){
			numBits += (i & 1); //check the least significant bit
			i >>>=1;		
		}
		return numBits;
	}
	
	public static void main(String args[]){
		int given = 999999999;
		System.out.println(numberOfBits(given));
	}
}
