
package day2;
import java.util.*;
public class Day2 {
public static void main(String[] args) {
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

}
    public static ArrayList<Integer> addTwoNumbers(ArrayList<Integer> l1,ArrayList<Integer> l2){
        ArrayList <Integer> l3 = new ArrayList<>();
        if(l2.size() < l1.size()){
            ArrayList<Integer> aux = l1;
            l1 = l2;
            l2 = aux;
        }
        return addTwoNumbers(l1, l2, l3, l1.size() - 1, 0);
    }
     private static ArrayList<Integer> addTwoNumbers(ArrayList<Integer> l1,ArrayList<Integer> l2,ArrayList<Integer> l3,int index,int rest){
         if(index == -1 && l1.size() == l2.size()){
             return l3;
         }
         if(index == -1){
             return addTwoNumbers(l2, l3, (l2.size() -l1.size()) - 1 , rest);
         }
         int sum = l1.get(index) + l2.get(index) + rest;
         
         l3.add(new Integer(sum > 9?sum%10:sum));
         
         return addTwoNumbers(l1, l2,l3,index - 1,sum > 9?sum/10:0);
     }
     
     private static ArrayList<Integer> addTwoNumbers(ArrayList<Integer> l2,ArrayList<Integer> l3,int index,int rest){
         if(rest == 0 || index == 0){
             //l3.add(new Integer((l2.get(index)+rest) > 10));
             if(rest > 0){
                 l3.add((l2.get(index)+rest) > 9?(l2.get(index)+rest)%10:(l2.get(index)+rest));
                 if((l2.get(index)+rest) > 9){
                     l3.add((l2.get(index)+rest)/10);
                 }
             }
             return l3;
         }
         int sum = (l2.get(index)+rest)%10;
         l3.add(new Integer(sum));
         return addTwoNumbers(l2, l3, index - 1,(l2.get(index)+rest) > 9?(l2.get(index)+rest)/10:0);
     }
}
