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
public class UocSoChiaHetCho2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;
            if(n == 0) {
                System.out.printf("0");
            }
            else {
                for(int i=1; i<=Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        if(i % 2 == 0) {
                            cnt++;
                        }
                        if((n/i) % 2 == 0 && i * i != n) {
                            cnt++;
                        }
                    } 
                }
                System.out.printf("%d", cnt);
            }
            System.out.println();
        }
    }   
}
