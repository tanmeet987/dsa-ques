import java.util.*;
import java.io.*;

public class partition {
public static void main(String[] args) throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
     
    // Base case 
    if(n == 0 || k == 0  || n<k){
        System.out.println(0);
        return;
    }
 long[][] dp = new long[k+1][n+1];
 for(int i=0; i<k;i++){
     for(int j=0;j<=n;j++){
         if(j<i){
             dp[i][j]=0;

         }else if(i==j){
             dp[i][j]=1;
         }else{
             dp[i][j]=dp[i-1][j-1]+dp[i][j-1]*i;
         }

     }
 }
 System.out.println(dp[k][n]);
}
}
// import java.io.*;

// import java.util.*;

// public class partition {

//   public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int k = scn.nextInt();

//     if (n == 0 || k == 0 || n < k) {
//       System.out.println(0);
//       scn.close();
//       return;
//     }

//     long[][] dp = new long[k + 1][n + 1];

//     for (int t = 1; t <= k; t++) {
//       for (int p = 1; p <= n; p++) {
//         if (p == t)
//           dp[t][p] = 1;
//         else if (p > t)
//           dp[t][p] = t * dp[t][p - 1] + dp[t - 1][p - 1];
//       }
//     }
//     System.out.println(dp[k][n]);
//     scn.close();
//   }
// }