/*
LeetCode #5
Given a string s, find the longest palindromic substring in s. 
You may assume that the maximum length of s is 1000.

 */
public class LongestPalindrome{
    public static String maxSubstring = "";
    
    public static String longestPalindrome(String s) {
        int index = 0;
        if(s.length() == 1)
            return s;
        while(index < s.length()-1){
            getPalindrome(index,index,s);
            getPalindrome(index,index+1,s);
            index++;
        }
        return maxSubstring;
    }
    public static void getPalindrome(int left, int right, String s){
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }else{
                break;
            }
        }
        String palindrome = s.substring(left+1,right);
        maxSubstring = palindrome.length() > maxSubstring.length() ? palindrome : maxSubstring;
    }

    public static void main(String[] args) {
        // test cases
        System.out.println(longestPalindrome("babad"));
        maxSubstring = "";
        System.out.println(longestPalindrome("cbbd"));
    }
}