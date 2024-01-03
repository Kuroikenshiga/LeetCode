
package day1;

public class Day1 {
public static void main(String[] args) {
 
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.;
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
    int[] array = {1,2,3,4,5};
    System.out.println(twoSum(array,7));

}
    public static String twoSum(int[]numbers,int target){
        for(int i = 0;i < numbers.length - 1;i++){
            for(int j = i + 1;j < numbers.length;j++){
                if((numbers[i] + numbers[j]) == target){
                    return "["+i+","+j+"]";
                }
            }
        }
        return "Undefined";
    }
}
