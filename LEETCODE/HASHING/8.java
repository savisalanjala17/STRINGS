class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String [] s=paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split("\\s+");

        HashMap<String,Integer> h=new HashMap<>();
        HashSet<String> h2= new HashSet<>(Arrays.asList(banned));

        for(int i=0;i<s.length;i++){
            String a= s[i];
            if(!h2.contains(a)){
                h.put(a,h.getOrDefault(a,0)+1);
            }
        }
        int maxFreq = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxKey = entry.getKey();
    }
}

   return maxKey;
        
    }
}



819. Most Common Word

Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Note that words can not contain punctuation symbols.

 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"
 

Constraints:

1 <= paragraph.length <= 1000
paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
0 <= banned.length <= 100
1 <= banned[i].length <= 10
banned[i] consists of only lowercase English lette
