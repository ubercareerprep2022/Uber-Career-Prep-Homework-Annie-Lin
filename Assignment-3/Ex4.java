import java.util.*;
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
 * sort the array 
 * 
 * create a hashmap that groups words with same breakdowns 
 * Map<String, ArrayList> = new HashMap<>()
 * "cat" : ["cat","tac","act"]
 * 
 * print the map 
 * 
 */

 //https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/

public class Ex4 {

    public static void main(String[] args){
        String[] input = new String[]{"cat", "dog", "tac", "god", "act"};
        groupAnas(input);
    }

    // Input: ["cat", "dog", "tac", "god", "act"]
    // map: 
    // ["a","c","t"]: ["cat","tac"]
    // ["d","o","g"]: ["dog"]

    public static ArrayList<String> groupAnas(String[] anas){

        Map<char[], ArrayList<String>> map = new HashMap<char[], ArrayList<String>>();

        for (String s : anas){
            char[] sorted = sortChars(s);
            if (!map.containsKey(sorted)){
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                map.put(sorted, list);
            } else {
                ArrayList<String> list = map.get(sorted);
                list.add(s);
                map.put(sorted, list);
            }
        }

        ArrayList<String> ret = mapToList(map);
        // printList(ret);
        return ret;
    }

    // input: "cat"
    public static char[] sortChars(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        printArray(chars);
        return chars;
    }

    public static ArrayList<String> mapToList(Map<char[], ArrayList<String>> map){
        ArrayList<String> vals = new ArrayList<String>();
        for (ArrayList<String> v : map.values()){
            vals.addAll(v);
        }
        return vals;
    }

    static void printList(ArrayList<String> list)
	{
		int n = list.size();
		for (int i=0; i<n; ++i)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}

    static void printArray(char arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
    
}
