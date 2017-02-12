package InterviewPractice;

/*
 * QUESTION: MIN STEPS IN INFINITE GRID
You are in an infinite 2D grid where you can move in any of the 8 directions :

	 (x,y) to 
	    (x+1, y), 
	    (x - 1, y), 
	    (x, y+1), 
	    (x, y-1), 
	    (x-1, y-1), 
	    (x+1,y+1), 
	    (x-1,y+1), 
	    (x+1,y-1) 
	You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.
*/

import java.util.ArrayList;

public class Q36_MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numberOfSteps = 0;
        for(int i = 0; i < X.size()-1;i++){
            numberOfSteps += Math.max(Math.abs(X.get(i+1) - X.get(i)), Math.abs(Y.get(i+1) - Y.get(i)));
        }
        
        return numberOfSteps;
    }
}
