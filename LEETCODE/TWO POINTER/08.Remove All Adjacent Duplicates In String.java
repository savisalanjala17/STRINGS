class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i=0;
        int j=i+1;

        while(i<sb.length()-1){

            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i,i+2);
            
            if(i>0){
                i--;
            }
            }
            else{
                i++;
            }

        

        }

        return new String(sb);
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

1047. Remove All Adjacent Duplicates In String

Hint
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.


Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
