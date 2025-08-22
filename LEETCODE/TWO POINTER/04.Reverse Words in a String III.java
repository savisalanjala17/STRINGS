class Solution {
    public String reverseWords(String s) {

        char[] c= s.toCharArray();

        int left=0;
        int right=0;

        while(right<=c.length-1){
            if(c[right]==' '){

                reverse(c,left,right-1);
                left=right+1;
            }
            right++;
        }
         reverse(c,left,right-1);
         return new String (c);
    }

            private void reverse(char a[],int left,int right){
                while(left<right){
                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
                }
            }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
