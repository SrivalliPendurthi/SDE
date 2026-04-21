package Searching;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] ar = new int[m][n];
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    ar[i][j] = sc.nextInt();
                }
            }
            int k = sc.nextInt();
            int ans = -1;
            int l=0;
            int r = m*n-1;
            while(l<=r) {
                int mid = (l+r)/2;

                int row = mid/n;
                int col = mid%n;
                if(ar[row][col] == k) {
                    ans =mid;
                    break;
                }
                else if(ar[row][col] < k) {
                    l = mid+1;
                }
                else {
                    r = mid-1;
                }
            }
            System.out.println(ans);
        }
        
    }
}
