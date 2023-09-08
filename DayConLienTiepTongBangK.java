/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
/**
 *
 * @author Administrator
 */

import java.io.*;
import java.util.*;
import java.math.*;

public class DayConLienTiepTongBangK {
    public static boolean bSearch(long[] a, int n, long x, int l, int r) {
        while(l <= r){
            int m = (l+r) / 2;
            if(a[m] == x)
                return true;
            else if(a[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
    
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n+5];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            long[] pre = new long[n+5];
            pre[0] = a[0];
            for(int i=1; i<n; i++){
                pre[i] = pre[i-1] + a[i];
            }
            int fl = 0;
            for(int i=n-1; i>=0; i--){
                if(bSearch(pre, n, pre[i] - k, 0, i-1) || pre[i] == k){
                    System.out.println("YES");
                    fl = 1;
                    break;
                }
            }
            if(fl == 0)
                System.out.println("NO");
       }
    }
}