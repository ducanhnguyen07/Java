/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class SapXepChon { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            System.out.printf("Buoc %d: ", i+1);
            int min_idx = i;
            for(int j=i+1; j<n; j++) {
                if(a[min_idx] > a[j]) {
                    min_idx = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = tmp;
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }   
}
