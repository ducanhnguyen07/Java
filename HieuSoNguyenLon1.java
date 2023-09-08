/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Administrator
 */
public class HieuSoNguyenLon1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String sa = a.toString();
            String sb = b.toString();
            BigInteger res = a.subtract(b).abs();
            String sr = res.toString();
            int max_len = Integer.max(sa.length(), sb.length());
            if(max_len > sr.length()){
                for(int i=0; i<max_len - sr.length(); i++) {
                    System.out.print("0");
                }
            }
            System.out.println(res);
        }
    }
}
