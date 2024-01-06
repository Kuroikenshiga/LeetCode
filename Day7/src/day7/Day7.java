package day7;

public class Day7 {
public static void main(String[] args) {
 
    System.out.println(reverseInteger(-57));
}
   public static int reverseInteger(int number){
       String stringNumber = Integer.toString(number),convertedInteger = "";
       
       for(int i = stringNumber.length() - 1; i > (number < 0?0:-1);i--){
           convertedInteger += stringNumber.charAt(i);
       }
       return Integer.parseInt(convertedInteger)*(number < 0?-1:1);
   }
}
