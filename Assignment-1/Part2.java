// pairsThatEqualSum(...)
// Implement the function pairsThatEqualSum() that takes an array of integers and a target integer 
// and returns an array of pairs (i.e., an array of tuples) where each pair contains two numbers 
// from the input array and the sum of each pair equals the target integer. 
// (Order of the output does not matter).

// Java		

public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {

    Collections.sort(inputArray);

    if (targetSum <= inputArray.get(0)) return null;

    List<Integer> ret = new ArrayList<Integer>();

    int size = inputArray.size;

    left = inputArray.get(0);
    right = inputArray.get(size - 1);

    for (int i = 1; i < size; i++){ // i = 2

        if ((left + right) == targetSum){
            
            List<Integer> pair = new ArrayList<Integer>();
            pair.add(left);
            pair.add(right);

            ret.add(pair);

            // move pointer 
            left = inputArray.get(0 + i);
        }

        else if ((left + right) < targetSum){
            left = inputArray.get(0 + i);
        }
        
        else if (left + right > targetSum){
            right = inputArray.get(size - 1 - i);
        }
    }

    return ret;

}



// Below are some examples:
// pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 5) == [(1, 4), (2, 3)]
// pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 1) == []
// pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 7) == [(2, 5), (3, 4)]
