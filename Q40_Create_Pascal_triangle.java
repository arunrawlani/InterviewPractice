public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(a == 0){
	        return result;
	    }
	    ArrayList<Integer> first = new ArrayList<Integer>();
	    first.add(1);
	    result.add(first);
	    int count = 0;
	    //now we have [1] in the result
	    //choose the last array in the results array
	    while(count < a-1){
	        ArrayList<Integer> last = result.get(result.size()-1); //getting the last element
	        ArrayList<Integer> newElem = new ArrayList<Integer>();
	        
	        for(int i = 0; i <= last.size(); i++){
	            int minusOne = 0;
	            int one = 0;
	            
	            //check if i-1 is out of bounds
	            if(i-1 < 0){
	                minusOne = 0;
	            }
	            else{
	                minusOne = last.get(i-1);
	            }
	            
	            //check if i is out of bounds for the last iteration
	            if(i > last.size()-1){
	                one = 0;
	            }
	            else{
	                one = last.get(i);
	            }
	            
	            int sum = minusOne + one;
	            newElem.add(sum);
	        }
	        
	        result.add(newElem);
	        count++;
	    }
	    
	    return result;
	}
}
