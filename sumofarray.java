import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class sumofarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=scn.nextInt();

        }
        int n2= scn.nextInt();
        int[] arr2 =new int[n2];
          for(int j=0;j<arr2.length;j++){
              arr[j]= scn.nextInt();
          }
          // ham ek sum size ka array declare krenge agar voh n1 size bada hua toh ham n1 size ka krenege aur agr n2 size bada hua toh ham n2 size ka ek array declare krenge
          int[] sum=new int[n > n2 ? n:n2];
         // ? this is actually a ternary operator agar n1 bada h toh hame n1 value mil gi nhi toh hame n2 value milgi
int carry=0;
int i = arr.length-1;
int j = arr2.length-1;
int k= sum.length-1;
while(k>=0){
    int digit = carry;
    if(i>=0){
        digit +=arr[i];

    }
    if(j>=0){
        digit+=arr2[j];

    }
    carry = digit/10;
    digit = digit%10;
    sum[k]=digit;
    i--;
    j--;
    k--;

}
if(carry!=0){
    System.out.println(carry);

}
for(int val:sum){
    System.out.println(val);
}
            
         }
}
