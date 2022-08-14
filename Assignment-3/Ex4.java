/*
Sorting Exercise 4: Group Anagrams
Write a method to sort an array of strings so that all the anagrams are next to each other. 
Assume the average length of the word as “k”, and “n” is the size of the array, 
where n >> k (i.e. “n” is very large in comparison to “k”). 
Do it in a time complexity better than O[n.log(n)]

Input: ["cat", "dog", "tac", "god", "act"]
*/ 

/*
 * 
 * Approach 1:
 * build a helper to break down each string
 * "cat" = ["c","a","t"]
 * 
 * create a hashmap that groups words with same breakdowns 
 * Map<String, ArrayList> = new HashMap<>()
 * "cat" : ["cat","tac","act"]
 * 
 * print the map 
 * 
 */

public class Ex4 {
    
}
