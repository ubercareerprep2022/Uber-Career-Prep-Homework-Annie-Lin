/*
Sorting Exercise 5: Peaks and Valleys
In an array of integers, a "peak" is an element that is greater than or equal to 
the adjacent integers and a "valley" is an element that is less than or equal to the adjacent integers. 
For example, in the array [5, 8, 6, 2, 3, 4, 6], [8, 6] are peaks and [5, 2] are valleys. 
Given an array of integers, sort the array into an alternating sequence of peaks and valleys.

Example 1
Input: [5,3,1,2,3]
Output: [5,1,3,2,3]

Example 2
Input: [100,100,100,100,0,0,0,0]
*/ 

/* 
 * Approach 2:
 * sort array and break into two halves 
 * [5,8,6,2,3,4,6] --> [2,3,4,5],[6,6,8]
 * 
 * fist array = valleys 
 * second array = peaks 
 * 
 * create a new array and insert elements from the two arrays in correct order
*/ 

public class Ex5 {
    
}


/*
 * Approach 1:
 * 
 * WRONG 
 * 
 * boolean peak = true 
 * int dex
 * while loop; condition: dex < arr.length
 * 5 < 8 && 8 > 6 --> peak = peak (8 is a peak)
 * 
 * expecting peak = !peak
 * 8 > 6 && 6 > 2 --> swap 6 and 2
 * 2 is valley
 * 
 * expecting peak = peak
 * 2 < 6 && 6 > 3 --> 6 is peak 
 * 
 * expecting peak = !peak
 * 6 > 3 && 3 < 4
 * 
 * output: [5, 8, 2, 6, 3, 4, 6]
 */

