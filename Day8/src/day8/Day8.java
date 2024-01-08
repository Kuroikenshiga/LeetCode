package day8;
import java.util.*;
public class Day8 {
public static void main(String[] args) {
    
}
    public static int stringToInteger(String s){
        ArrayList<Character> stringToConvert = new ArrayList();
        boolean isPositive =  s.charAt(0) == '-'?false:true;
        int floatPointIndex = 1,amountFloatPoint = 0,valueConverted = 0,nextPosition = 0;
        
        for(int i = s.length() - 1; i > -1;i--){
            String aux = "";
            aux += s.charAt(i);
            if(aux.matches("[0-9]")){
                
            
            stringToConvert.add(0, s.charAt(i));
           
            if(floatPointIndex%3 == 0 && i != 0){
                aux = ""; 
                aux += s.charAt(i - 1);
                if(aux.matches("[0-9]")){
                     stringToConvert.add(0, '.');
                 }
                
            }
            floatPointIndex++;
            }
            aux = "";
        }
        stringToConvert.addLast('.');
        for(char i:stringToConvert){
            if(i == '.'){
                amountFloatPoint++;
            }
        }
        amountFloatPoint--;
        if(stringToConvert.size() < 4){
            return (stringToConvert.size() == 3?(convertUnitValue(stringToConvert.get(0))*10)+convertUnitValue(stringToConvert.get(1)):convertUnitValue(stringToConvert.get(0)))*(isPositive?1:-1);
        }
        for(int i = 0;i < stringToConvert.size();i+=nextPosition){
            int value = 0;
           
                if(stringToConvert.get(i + 3) == '.'){
                     value = convertUnitValue(stringToConvert.get(i)) * 100;
                     value += convertUnitValue(stringToConvert.get(i + 1)) * 10;
                     value += convertUnitValue(stringToConvert.get(i + 2));
                     nextPosition = 4;
                }
                else if(stringToConvert.get(i + 2) == '.'){
                    value = convertUnitValue(stringToConvert.get(i)) * 10;
                     value += convertUnitValue(stringToConvert.get(i + 1));
                     nextPosition = 3;
                }
                else{
                    value = convertUnitValue(stringToConvert.get(i));
                    nextPosition = 2;
                }
            
            valueConverted += value*(amountFloatPoint == 3?1000000000:amountFloatPoint == 2?1000000:amountFloatPoint == 1?1000:1);
            amountFloatPoint--;
        }
        
        return valueConverted*(isPositive?1:-1);
    }
    
    private static int convertUnitValue(char c){
        return c == '9'?9:c == '8'?8:c == '7'?7:c == '6'?6:c == '5'?5:c == '4'?4:c == '3'?3:c == '2'?2:c == '1'?1:0;
    }
}
