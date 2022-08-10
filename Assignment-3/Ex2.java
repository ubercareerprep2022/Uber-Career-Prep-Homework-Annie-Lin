// Sorting Exercise 2: External Sort
// Given a large array containing a million entries, sort them by loading only 100 entries at a time in memory.

// implement merge sort 
// load 100 entries at a time, sort 
// merge in the end 

// input: 
// A = [[0,50,...,3,8,9],[21,90,...,32],...[1900,48021,...24891]]
// 1,000,000 / 100 = 10,000
// loop thru 10000 entries of A and implement merge sort on each entry
// A = [[0,3,8,9,50...],[21,32,90,...],...,[1900,24891,48021,...]]
// 10,000 / 100 = 10
// ???

Class ExternalSort{
    static void main(String[] args){

    }

    static void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

    static int[] merge(int arr[], int lo, int mid, int hi){

        int[] temp = new int[hi - lo + 1];
        int k = 0;
        int p = lo; // iterate thru first half
        int q = mid + 1; // iterate thru second half 

        for (int i = 0; i < temp.length; i++){
            if (p > mid) {
                temp[k++] = arr[q];
            } else if (q > hi){
                temp[k++] = arr[p];
            } else if (arr[p] < arr[q]){
                temp[k++] = arr[p++];
            } else {
                temp[k++] = arr[q++];
            } 
        }

        for (int i = 0; i < temp.length; i++){
            arr[i] = temp[i];
        }

        return arr;
    }

    static int[] mergeSort(int arr[], int lo, int hi){

        while (lo < hi){ // if we don't have the while loop, recursion will be infinite 
            int mid = arr.length / 2;
            mergeSort(arr[], lo, mid-1);
            mergeSort(arr[], mid, hi);
        }

        merge(arr[], lo, mid, hi);
    }

}