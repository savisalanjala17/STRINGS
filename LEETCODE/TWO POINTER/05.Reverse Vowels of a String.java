class Solution {
    public String reverseVowels(String s) {

        char [] c = s.toCharArray();

        String vowels ="aeiouAEIOU";

        int left =0;
        int right=c.length-1;

        while(left<right){

            while(left<right && vowels.indexOf(c[left])==-1){
                left++;
            }

            while(left<right && vowels.indexOf(c[right])==-1){
                right--;
            }

            char temp = c[left];
            c[left]=c[right];
            c[right]=temp;

            left++;
            right--;
        }

        return new String(c);
        
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
