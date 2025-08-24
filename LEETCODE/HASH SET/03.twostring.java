public static String twoStrings(String s1, String s2) {
   
    HashSet<Character> h1 = new HashSet<>();
    HashSet<Character> h2 = new HashSet<>();
    
    for (int i = 0; i < s1.length(); i++) {
        h1.add(s1.charAt(i));
    }
    
    for (int i = 0; i < s2.length(); i++) {
        h2.add(s2.charAt(i)); 
    }
    
   
    h1.retainAll(h2);
    
    return (!h1.isEmpty()) ? "YES" : "NO";
}


Problem: Two Strings

Given two strings, determine if they share at least one common substring.
A substring may be as small as one character.

Input

Two strings s1 and s2.

Each string consists of lowercase English letters (a–z).

Output

Print "YES" if they share at least one common substring.

Print "NO" if they do not.

Example 1

Input:

s1 = "hello"
s2 = "world"


Output:

YES


Explanation:
Both strings share the character 'o'.

Example 2

Input:

s1 = "hi"
s2 = "world"


Output:

NO


Explanation:
There are no common characters between "hi" and "world".

Constraints

1 <= |s1|, |s2| <= 10^5

Strings consist of only lowercase English letters.
