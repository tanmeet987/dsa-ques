import java.util.*;
import java.io.*;
public class code{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=10;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        
        // int[] arr2;
        // arr[2]=200;
        swap(arr,0,3);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// ans mein mujhe 200 mil ra h instead of 2 why?
// it has a reason and the reason is 