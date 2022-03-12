// span of the array ka ameaning matlab poore
// array mein max and min value ka difference
// inn 6 elements ayenge inn 6 elements mein sabse bada kon h 40 and sabse choota h 4
import java.util.*;
import java.io.*;
public class span{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= scn.nextInt();

        }
        int max= arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];

            }
        }
        int span = max-min;
        System.out.println(span);
        
    }
}