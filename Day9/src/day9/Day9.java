package day9;

public class Day9 {
public static void main(String[] args) {
    
}
    public static boolean palindromeNumber(int n){
        String s = Integer.toString(n);
        
        for(int i = 0;i < s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
