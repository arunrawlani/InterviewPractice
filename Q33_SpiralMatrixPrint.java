package InterviewPractice;

import java.awt.List;
import java.util.ArrayList;

public class Q33_SpiralMatrixPrint {
		// DO NOT MODIFY THE LIST
		public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
			 ArrayList<Integer> result = new ArrayList<Integer>();
			 //result = getSpiral(a, result, 0, a.size() - 1, 0, a.get(0).size() - 1);
			 // Populate result;
			 return getSpiral(a, result, 0, a.size(), 0, a.get(0).size());
		}
		
		public ArrayList<Integer> getSpiral(List<ArrayList<Integer>> a, ArrayList<Integer> result, int rowStart, int rowEnd, int colStart, int colEnd){
		    int rs = rowStart;
		    int re = rowEnd;
		    int cs = colStart;
		    int ce = colEnd;
		    
		    while(rs < re && cs < ce){
		         
		            for(int i = cs; i < ce; i++){
		                result.add(a.get(rs).get(i));
		            }
		            rs++;


		            for(int i = rs; i < re; i++){
		                result.add(a.get(i).get(ce-1));
		            }
		            ce--;

	                if(rs < re){
		            for(int i = ce-1; i >= cs; i--){
		                result.add(a.get(re-1).get(i));
		            }
		            re--;
	                }
	                
	                if(cs < ce){
		            for(int i = re-1; i >= rs; i--){
		                result.add(a.get(i).get(cs));
		            }
		            cs++;
	                }
		    }
		    
		    return result;
		}
		
		//DOES NOT HAVE A MAIN METHOD
}
