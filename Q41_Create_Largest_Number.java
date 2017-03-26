/*
* The trick is that you got to sort strings instead of sorting integers in this case. So  firstly convert all number to an array of strings.
* Define a comparator to compare strings by concat() right-to-left or left-to-right. 
* POINTS TO REVISE: - How to define comparators in Java. How they work.
* WOWZA MOMENT: Need to truncate extra zeroes.
*
*/

String[] arr = new String[a.size()];
for(int i = 0; i < a.size(); i++){
  arr[i] = String.valueOf(a.get(i)); //converting everything to a string
}

//Now we are going to chnage the compare method such that it compares just string concat is larger than the other.
Arrays.sort(arr, new Comparator(){
  public int compare(String a, String b){
    return (a+b).compareTo(b+a);
  }
});

public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    String[] arr = new String[a.size()];
	    for(int i = 0; i < a.size(); i++){
	        arr[i] = String.valueOf(a.get(i));
	    }

//Now we are going to change the compare method such that it compares strings concatenations and sorts them according to the ones that gives the highest numbers.
	    Arrays.sort(arr, new Comparator<String>(){
	        public int compare(String a, String b){
	            return (b+a).compareTo(a+b);
	        }
	    });
	    
	    StringBuilder sb = new StringBuilder();
	    for (String s: arr){
	        sb.append(s);
	    }

//truncates the extra zeroes
	    while(sb.charAt(0) == '0' && sb.length() > 1){
	        sb.deleteCharAt(0);
	    }
	    
	    return sb.toString();
	}
	
}
