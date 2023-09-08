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
public class KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] F = new long[100];
        F[0] = 0;
        F[1] = 1; 
        for(int i=2; i<=93; i++){
            F[i] = F[i-1] + F[i-2];
        }
        while(t-- > 0) {
            long n = sc.nextLong();
            for(int i=0; i<=93; i++){
                if(n == F[i]) {
                    System.out.println("YES");
                    break;
                }
                else if(n < F[i]) {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
    
}
