// isStringPermutation(...)
// Implement the function isStringPermutation() that takes two Strings as parameters 
// and returns a Boolean denoting whether the first string is a permutation of the second string.

// Java		


public boolean isStringPermutation(String s1, String s2) {

    if (s1.length() != s2.length()) return false;

    char arr1[] = s1.toCharArray();
    char arr2[] = s2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for (int i = 0; i < arr1.length; i++){
        if (arr1[i] != arr2[i]) return false;
    }

    return true;

}


// Below are some examples:
// isStringPermutation(s1: “asdf”, s2: “fsda”) == true
// isStringPermutation(s1: “asdf”, s2: “fsa”) == false
// isStringPermutation(s1: “asdf”, s2: “fsax”) == false

