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
public class BoiSoChungUocSoChung {
    public static long Gcd(long a, long b) {
        while(b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = a, n = b;
            long lcm = a * b / Gcd(m, n);
            System.out.printf("%d %d", lcm, Gcd(m, n));
            System.out.println();
        }
    }   
}
