package Searching;

import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = n;
        int l = 0;
        int r = n-1;

        while(l<=r) {
            int mid = (l+r)/2;
            if(ar[mid]==k) {
                ans = mid;
                break;
            } else if(ar[mid]<k) {
                l = mid + 1;
            } else {
                ans = mid;
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
