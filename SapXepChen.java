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
public class SapXepChen { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("Buoc 0: %d", a[0]);
        System.out.println();
        for(int i=1; i<n; i++) {
            System.out.printf("Buoc %d: ", i);
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            for(int k=0; k<=i; k++) {
                System.out.printf("%d ", a[k]);
            }
            System.out.println();
        }
    }   
}
