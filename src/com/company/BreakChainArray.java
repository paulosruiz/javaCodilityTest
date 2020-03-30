package com.company;

public class BreakChainArray {
   /*
   Inputs:
     5,2,4,6,3,7
     5,2,4,6,3,9
     5,1,4,6,3,7
     1,2,3,4,5,6
     6,5,4,3,2,1
     6,5,4,3,8,1
     6,5,4,3,0,1
     1,1,1,1,1,1
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        // if array has less than 5 cannot break

        int length = A.length;
        if (length < 5){
            return -1;
        }else{
            // Case array has more than 5 it can be break;
            int lastPosition = length - 1;
            // Sum of two positions value will never gave more than MAX_Value
            int minEffort = Integer.MAX_VALUE;

            int beforePreviousPosition = A[1];
            int previousPosition = A[2];

            // will start from the second break - try
            for (int i = 3; i < lastPosition; i++){
                int current = A[i] + beforePreviousPosition;
                System.out.println(" minEffort:" + minEffort + " current:" + current);
                if (current < minEffort){
                    System.out.println("new minEffort:" + current);
                    minEffort = current;
                }
                if (previousPosition < beforePreviousPosition){
                    beforePreviousPosition = previousPosition;
                }
                if (A[i] < previousPosition){
                    previousPosition = A[i];
                }
            }
            return minEffort;
        }
    }

}
