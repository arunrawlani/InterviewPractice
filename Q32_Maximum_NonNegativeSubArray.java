import java.util.ArrayList;
import java.util.Arrays;
    
    public class Q32_Maximum_NonNegativeSubArray {
        public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
            
            
            int minIndex = -1, maxLength = 0, currMin = -1, currLength = 0;
            long maxSum = 0, currSum = 0;
            
            ArrayList<Integer> set = new ArrayList<Integer>();
            
            for(int i = 0; i < a.size(); i++){
                int curr = a.get(i);
                
                if(curr >= 0){
                    if(currMin == -1){
                        currMin = i;
                    }
                    currSum += curr;
                    currLength++;
                }
                else{
                    
                    if((currSum > maxSum) || (currSum == maxSum && currLength > maxLength)){
                        maxSum = currSum;
                        maxLength = currLength;
                        minIndex = currMin;
                    }
                    
                    currSum = 0;
                    currLength = 0;
                    currMin = -1;
                }
            }
            
            if((currSum > maxSum) || (currSum == maxSum && currLength > maxLength)){
                maxSum = currSum;
                maxLength = currLength;
                minIndex = currMin;
            }
            
            if(minIndex != -1){
                for(int i = minIndex; i <= minIndex+maxLength-1; ++i){
                    set.add(a.get(i));
                }
            }
            
            return set;
            
        }
        
        public static void main (String args[]){
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> result = new ArrayList<Integer>();
            a.add(762187323);
            a.add(999999999);
            a.add(-1);
            
            
            System.out.println("Going in");
            result = maxset(a);
            System.out.println("Coming");
            System.out.println(result);
        }
    }
}
