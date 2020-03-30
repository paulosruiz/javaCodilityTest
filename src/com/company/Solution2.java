package com.company;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] A) {
        if(A.length < 2){
            return 0;
        }
        int length = A.length;
        //count of current value
        int countCurrentValue = 1;
        //count of previous seen value
        int countPreviousValue = 0;
        int result = 0;

        //Sort the list to simplify the adjacent logic calculation
        Arrays.sort(A);

        //Start from the begin position
        int previousPositionValue = A[0];

        // Starts searching into the array from the position 1
        for (int i = 1; i < length; i++) {
            // If current values is equals to previous position
            if (A[i] == previousPositionValue) {
                System.out.println("Current equals Previous. Increment");


                //Inplus all values equal to the current one, eg: 1 1 1 2 2(current)
                result += countPreviousValue + countCurrentValue;

                countCurrentValue++;
            } else {
                // Current is different from previous value.
                //a new value, pair it with all previous equal values
                result = result + countCurrentValue;
            //    result += countCurrentValue;
                countPreviousValue = countCurrentValue;
                countCurrentValue = 1;
            }
            previousPositionValue = A[i];
        }
        return result;
    }

}
