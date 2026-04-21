package Searching;

import java.util.Scanner;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int r = n;
        int ans = -1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(mid*mid==n) {
                ans = mid;
                break;
            } else if(mid*mid<n) {
                ans = mid;
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}