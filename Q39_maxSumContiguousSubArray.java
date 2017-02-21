package InterviewPractice;

import java.util.ArrayList;

public class Q39_maxSumSubArray {
	public static int maxSubArray(ArrayList<Integer> a){
		int currSum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;
		
		for(int num: a){
			if(currSum < 0 && num > currSum){
				currSum = num;
			}
			else currSum += num;
			
			maxSum = Math.max(currSum, maxSum);
		}
		
		return maxSum;
	}
}