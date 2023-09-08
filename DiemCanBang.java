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
public class DiemCanBang { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            boolean fl = true;
            int[] a = new int[n];
            int[] p = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            p[0] = a[0];
            for(int i=1; i<n; i++) {
                p[i] = p[i-1] + a[i];
            }
            for(int i=1; i<n; i++) {
                if(p[n-1] - p[i] == p[i-1]) {
                    System.out.println(i + 1);
                    fl = false;
                    break;
                }
            }
            if(fl) {
                System.out.println(-1);
            }
        }
    }   
}
