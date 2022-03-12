import java.util.*;
import java.io.*;
public class mincost{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
                // this was an original array
            }
        }
    int[][] dp = new int[n][m];
   for(int i=dp.length;i>=0;i--){
       for(int j=0;j<dp[0].length;j--){
           if(i==dp.length && j==dp[0].length){
               dp[i][j]=arr[i][j];
           }
           else if(i==dp.length-1){
               dp[i][j]=arr[i][j+1]+arr[i][j];
           }
           else if(j==dp.length-1){
            dp[i][j]=arr[i+1][j]+arr[i][j];
           }
           else{
               dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
           }
       }
   }
   System.out.println(dp[0][0]);
    }

}
