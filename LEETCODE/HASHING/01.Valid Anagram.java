class Solution {
    public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
 
	HashMap<Character,Integer>s1=new HashMap<>();
 
 
	for( char c : s.toCharArray()){
		s1.put(c, s1.getOrDefault(c,0)+1);
 
	}
 
	for( char c : t.toCharArray()){
		if(!s1.containsKey(c) || s1.get(c)==0){
			return false;
		}
 
		s1.put(c,s1.get(c)-1);
	}
 
		return true;
	}

 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.


Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
