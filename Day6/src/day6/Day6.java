package day6;
import java.util.*;
public class Day6 {
public static void main(String[] args) {

    
}
    public static String zigzagConversion(String s, int rows){
        char[][] zigzag = new char[rows][s.length()];
        
        boolean diagonalRow = false;
        
        int stringIndice = 0,diagonalrowIndice = 0;
        
        for(int i = 0;i < zigzag[0].length;i++){
            for(int j = 0; j < zigzag.length;j++){
                if(stringIndice != s.length()){
                   
                
                if(diagonalRow){
                   
                    if(j == diagonalrowIndice){
                        zigzag[j][i] = s.charAt(stringIndice);
                        stringIndice++;
                        diagonalrowIndice--;
                    }
                    else{
                         if(diagonalrowIndice == 0 && j == rows - 1){
                            diagonalRow = false;
                        }
                         
                         zigzag[j][i] = '_';
                         
                    }
                    
                }
                else{
                    zigzag[j][i] = s.charAt(stringIndice);
                    stringIndice++;
                    if(j + 1 == rows){
                        diagonalRow = true;
                        diagonalrowIndice = j - 1;
                    }
                }
            }
        }
        }
        String stringConverted = "";
        
        for(int i = 0; i < zigzag.length;i++){
            for(int j = 0; j < zigzag[0].length;j++){
                if(zigzag[i][j] != '_'){
                    stringConverted += zigzag[i][j];
                }
            }
        }
        return stringConverted;
    }
}
