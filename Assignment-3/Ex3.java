/* Sorting Exercise 3: Sorted Merge 
You are given two sorted arrays, A and B, where A has a large enough buffer at the
end to hold B. Write a method to merge B into A in sorted order in one pass and using O(1) space. 
 */

 /* faster: https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/
  * --> why would this work?
 */

/* 
Input : a[] = {10, 12, NA, NA, NA};   
        b[] = {14, 15, 19};
        lastIndex = 10;
Output : a[] = {10, 12, 14, 15, 19}
 */

class SortedMerge {
     public int[] sortedMerge(int[] a, int[] b){

        int i = a.length - 1; // track a
        int j = b. length - 1; // track b
        int last = i + j - 1;

        while (j >= 0){
            if (i >= 0 && a[i] > b[j]){
                a[last--] = a[i--];
            } else {
                a[last--] = b[i--];
            }
        } 

         return a;
     }
}
