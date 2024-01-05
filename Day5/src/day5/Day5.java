package day5;

public class Day5 {
public static void main(String[] args) {
    System.out.println(longestPalindromicSubString("cbbd"));
}
    public static boolean isPalindrome(String s){
        for(int i = 0;i < s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static String longestPalindromicSubString(String s){
        String longestSubSubStringPalindromic = "";
        
        for(int i = 0; i < s.length() - 1;i++){
            String longestPalidromeCandidate = "";
            longestPalidromeCandidate += s.charAt(i);
            if(longestSubSubStringPalindromic.length() >= s.length() - i){
                break;
            }
            for(int j = i + 1;j < s.length();j++){
                longestPalidromeCandidate += s.charAt(j);
                if(isPalindrome(longestPalidromeCandidate)){
                    if(longestPalidromeCandidate.length() > longestSubSubStringPalindromic.length()){
                        longestSubSubStringPalindromic = longestPalidromeCandidate;
                    }
                }
            }
        }
        return longestSubSubStringPalindromic;
    }
}
