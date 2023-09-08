/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class ChuanHoaXauHoTen1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                System.out.printf("%c%s ", Character.toUpperCase(tmp.charAt(0)), tmp.substring(1));
            }
            System.out.println("");
        }
    }
}
