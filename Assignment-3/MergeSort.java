class MergeSort{
   //merge two sub sorted arrays A[start..mid] and A[mid+1..end]
   void merge(int A[] , int start, int mid, int end) {
   //stores the starting position of both parts in temporary variables.
   int p = start; // p will iterate over A[start..mid]
   int q = mid+1; // q will iterate over A[mid+1..end]
   int[] arr = new int[end-start+1]; // Temp arr to stores intermediary sorted elements
   int k = 0; // k is index of the arr being written
 
   // Iterate over all elements from start..end
   for(int i = start; i <= end; i++) {
     if(p > mid)  { // has the first part come to an end.
        arr[k++] = A[q++];
      } else if (q > end) { // has the second part come to an end
        arr[k++] = A[p++];
      } else if(A[p] < A[q]) { // first part has a smaller element.
       arr[k++] = A[p++];
      } else { // second part has a smaller element.
       arr[k++] = A[q++];
      }
   }
   // Copy the sorted temp arr[] elements into the incoming A[]
   // Ihe incoming array will have elements in sorted manner 
   // including both parts A[start..mid] and A[mid+1..end]
   for (p=0; p < k; p ++) {
      A[start++] = arr[p] ;                          
   }
 }
 
 // merge_sorrt sorts an array A[] between start and end indexes
 void merge_sort (int A[] , int start , int end) {
    if (start < end ) {
        int mid = (start + end ) / 2 ; // divide array in 2 parts .
        merge_sort (A, start , mid ) ; // sort 1st part of the array .
        merge_sort (A,mid+1 , end ) ;  // sort 2nd part of array.
 
        // merge the both parts by comparing elements of both the parts.
        merge(A, start, mid, end );   
    }                    
 }
 
}
  