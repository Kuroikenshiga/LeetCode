package day4;
import java.util.*;
public class Day4 {
public static void main(String[] args) {

    int[] a = {1,2},b = {3,4};
    //1,2,7,8,9
    System.out.println(medianOfTwoSortedArrays(a, b));

}
    public static double medianOfTwoSortedArrays(int[]a,int[]b){
        int[] c = new int[a.length+b.length];
        int[] aux;
        int j = 0,k = 0;
        
        if(a.length > b.length){
            aux = a;
            a = b;
            b = aux;
        }
        
        
        for(int i = 0;i < c.length;i++){
            if(j < a.length){
                if(k < b.length){
                    if(a[j] > b[k]){
                        c[i] = b[k];
                        k++;
                    }
                    else{
                        c[i] = a[j];
                        j++;
                    }
                }
                else{
                    c[i] = a[j];
                    j++;
                }
            }
            else{
                c[i] = b[k];
                k++;
            }
       }
        return c.length%2 == 0?(double)(c[(c.length/2) - 1] + c[(c.length/2)])/2:c[(c.length/2)];
}
}