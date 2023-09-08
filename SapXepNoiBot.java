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
public class SapXepNoiBot { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            boolean check = false;
            for(int j=0; j<n-i-1; j++) {
                if(a[j] > a[j+1]) {
                    check = true;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(!check) {
                break;
            }
            System.out.printf("Buoc %d: ", i+1);
            for(int k=0; k<n; k++) {
                System.out.printf("%d ", a[k]);
            }
            System.out.println();
        }
    }   
}
