/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MangDoiXung { 
    public static boolean Check(int[] a, int n) {
        int l = 0;
        int r = n - 1;
        while(l < r){
            if(a[l++] != a[r--]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            if(Check(a, n)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }   
}
