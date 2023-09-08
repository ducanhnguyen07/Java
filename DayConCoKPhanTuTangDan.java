/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
/**
 *
 * @author Administrator
 */

import java.util.*;
import java.math.*;
import java.util.Scanner;



public class DayConCoKPhanTuTangDan {
    static int n = 0;
    static int k = 0;
    static int[] a = new int[20];
    static int[] b = new int[20];
    
    public static void outp(int k) {
        for(int i=1; i<=k; i++){
            System.out.print(b[a[i]] + " ");
        }
        System.out.println();
    }
        
    public static void Try(int i) {
        for(int j=a[i-1]+1; j<=n-k+i; j++){
            a[i] = j;
            if(i == k){
                outp(i);
            }
            else{
                Try(i+1);
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i=1; i<=n; i++){
                b[i] = sc.nextInt();
            }
            for(int i=1; i<=n; i++){
                for(int j=i+1; j<=n; j++){
                    if(b[i] > b[j]){
                        int tmp = b[i]; b[i] = b[j]; b[j] = tmp;
                    }
                }
            }
            Try(1);
        }
    }
}