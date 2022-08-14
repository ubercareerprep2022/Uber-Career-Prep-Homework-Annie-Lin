// Sorting Exercise 1: Three Partition Sort
// Given an Array [5, 10, 5, 20, 5, 5, 10], sort them in a single pass.

// Sorting in Java: geeksforgeeks.org/sorting-in-java/

/*
 * this problem seems solved when i walk thru it manually, 
 * but it is not when i run it in the compiler
 * online solution: https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */

import java.util.*;

class ThreePartitionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,4,8,4,4,8,8,10};
        arr = sort(arr);
        printArray(arr);
    }
    
    static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

    public static int[] sort(int[] arr){

        Set<Integer> set = new TreeSet<Integer>();
        for (int i : arr){
            set.add(i);
        }

        Integer[] keys = new Integer[set.size()];
        set.toArray(keys);

        int low, temp, mid;
        low = temp = mid = 0;
        int high = arr.length - 1;

        // {10,4,8,4,4,8,8,10}
        // mid = 4
        // low = 2
        // high = 5

        // arr[] = {4,4,8,8,4,8,10,10}

        while (mid <= high){
            int val = arr[mid]; // 4
            if (val == keys[0]) {
                temp = arr[low]; // 8
                arr[low] = arr[mid]; // 4 
                arr[mid] = temp; // 8
                low++;
                mid++;
                break;
            } else if (val == keys[1]) {
                mid++;
                break;
            } else {
                temp = arr[high]; // temp = 8
                arr[high] = arr[mid]; // 10
                arr[mid] = temp; // 8
                high--;
                break;
            }
        }
        return arr;
    }
}