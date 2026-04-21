package Searching;

import java.util.Scanner;

public class SearchForARange{
    public static int[] main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = new int[2];
        

        int l =0;
        int r=n-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(ar[mid]==k) {
                ans[0] = mid;
                r = mid-1;
            } else if(ar[mid]<k) {
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return ans;
    }
    
}