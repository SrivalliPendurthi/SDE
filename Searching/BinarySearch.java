package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int k = sc.nextInt();
        int ans =-1;
        
            int l = 0;
            int r = n-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(ar[mid]==k) {
                ans = mid;
                break;
            } else if(ar[mid]<k) {
                l=mid+1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
}
