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
public class DienThoaiCucGach { 
    public static String conv(String s) {
        String res = "";
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'B' || s.charAt(i) == 'C')
                res += 'A';
            else if(s.charAt(i) == 'E' || s.charAt(i) == 'F')
                res += 'D';
            else if(s.charAt(i) == 'H' || s.charAt(i) == 'I')
                res += 'G';
            else if(s.charAt(i) == 'K' || s.charAt(i) == 'L')
                res += 'J';
            else if(s.charAt(i) == 'N' || s.charAt(i) == 'O')
                res += 'M';
            else if(s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S')
                res += 'P';
            else if(s.charAt(i) == 'U' || s.charAt(i) == 'V')
                res += 'T';
            else if(s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z')
                res += 'W';
            else
                res += s.charAt(i);
        }
        return res;
    }
    
    public static String check(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--))
                return "NO";
        }
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(check(conv(s)));
        }
    }
}
