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



public class DayConCoTongNguyenTo {
    static int n = 0;
    static int ok = 0;
    static int[] a = new int[20];
    
    public static boolean checkPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
    
    public static void gene(int[] a, int n) {
        int i = n;
        while(i >= 1 && a[i] == 1){
            a[i] = 0;
            i--;
        }
        if(i == 0){
            ok = 0;
        }
        else {
            a[i] = 1;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            ok = 1;
            for(int i=1; i<=n; i++){
                a[i] = 0;
            }
            int[] b = new int[20];
            for(int i=1; i<=n; i++){
                b[i] = sc.nextInt();
            }
            for(int i=1; i<=n; i++){
                for(int j=i+1; j<=n; j++){
                    if(b[i] < b[j]){
                        int tmp = b[i]; b[i] = b[j]; b[j] = tmp;
                    }
                }
            }
            while(ok == 1){
                int sum = 0;
                for(int i=1; i<=n; i++){
                    sum += a[i]*b[i];
                }
                if(checkPrime(sum)){
                    for(int i=1; i<=n; i++){
                        if(a[i] == 1)
                            System.out.print(b[i] + " ");
                    }
                    System.out.println();
                }
                gene(a, n);
            }
        }
    }
}