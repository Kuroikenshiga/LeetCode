package day3;

public class Day3 {
public static void main(String[] args) {
    
    System.out.println(longestSubString("pwwkew"));
}
    public static int longestSubString(String s){
        int longest = 0;
        String subS = "";
        
        for(int i = 0; i < s.length();i++){  
            
          boolean alredyIn = false;
          
           for(int j = 0;j < subS.length();j++){
               if(s.charAt(i) == subS.charAt(j)){
                   alredyIn = true;
                   subS = "";
                   i--;
                   break;
               }
           }
           
           if(!alredyIn){
               subS += s.charAt(i);
           }
           
           if(subS.length() > longest){
               longest = subS.length();
           }
        }
        return longest;
    }
}
