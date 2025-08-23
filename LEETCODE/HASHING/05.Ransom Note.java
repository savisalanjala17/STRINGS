class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>h=new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);

        }

        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(!h.containsKey(c) || h.get(c)==0){
                return false;
            }
            h.put(c,h.get(c)-1);

        }

    return true;
        
    }
}







383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
