/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class UocSoNguyenToLonNhat {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long ma = Long.MIN_VALUE;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0) {
                    while(n % i == 0) {
                        n /= i;
                        ma = i;
                    }
                }
            }
            if(n > 1) {
                ma = n;
            }
            System.out.println(ma);
        }
    }   
}
