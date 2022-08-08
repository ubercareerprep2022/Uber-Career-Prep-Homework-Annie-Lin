// Sorting Exercise 2: External Sort
// Given a large array containing a million entries, sort them by loading only 100 entries at a time in memory.

// implement merge sort 
// load 100 entries at a time, sort 
// merge in the end 

Class ExternalSort{
    static void main(String[] args){

    }

    static void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

    static int[] merge(int arr[], int lo, int hi){

    }

    static int[] mergeSort(int arr[]){
        while (lo < hi){
            int mid = arr.length / 2;
            int lo = 0;
            int hi = arr.length - 1;

            mergeSort(arr[], lo, mid-1);
            mergeSort(arr[], mid, hi);
        }

        merge(arr[]);
    }

}