/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class DayConCoTongLe { 
    public static void outp(int[] a, int[] b, int n) {
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(b[i] == 1)
                sum += a[i];
        }
        if(sum % 2 != 0){
            for(int i=0; i<=n; i++){
                if(b[i] != 0)
                    System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void Try(int[] a, int[] b, int i, int n) {
        for(int j=0; j<=1; j++){
            b[i] = j;
            if(i == n)
                outp(a, b, n);
            else
                Try(a, b, i+1, n);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i] < a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Try(a, b, 0, n-1);
        }
    }
}