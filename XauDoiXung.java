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
public class XauDoiXung { 
    public static String check(String s) {
        int cnt = 0;
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--))
                cnt++;
        }
        if(cnt > 1 || (s.length() % 2 == 0 && cnt == 0))
            return "NO";
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
