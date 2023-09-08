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
public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q = t;
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", q - t);
            int m = 2;
            while(n > 1){
                int cnt = 0;
                while(n % m == 0) {
                    n /= m;
                    cnt++;
                }
                if(cnt > 0) {
                    System.out.printf("%d(%d) ", m, cnt);
                }
                m++;
            }
            System.out.println();
        }
    }
    
}
