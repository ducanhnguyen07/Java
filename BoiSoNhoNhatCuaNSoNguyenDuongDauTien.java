/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien { 
    public static long Gcd(long a, long b) {
        while(b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextInt();
            long res = 1;
            for(long i=1; i<=n; i++) {
                long a = i;
                long b = res;
                res = a * b / Gcd(a, b);
            }
            System.out.println(res);
        }
    }   
}
