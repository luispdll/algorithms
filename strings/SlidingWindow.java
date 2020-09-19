/* 
LeetCode #3
    Given a string s, find the length of the longest substring without repeating characters.
Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
*/
class SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0; 
        int end = 0;
        int max = 0;
        int[] characters = new int[256];
        
        while(end < s.length()){
            characters[s.charAt(end)]++; // increase a character
            while(characters[s.charAt(end)] > 1){ // stops when there is no repeated characters in substring
                characters[s.charAt(start)]--; // delete character useless
                start++; // move start index
            }   
            max = Math.max(end-start+1,max); // chooose between max and current substring
            end++; 
        }
        return max;
    }

    public static void main(String args[]){
        // test cases
        System.out.println("" + lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println("" + lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println("" + lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println("" + lengthOfLongestSubstring("")); // 0
        System.out.println("" + lengthOfLongestSubstring(" ")); // 1
    }
}