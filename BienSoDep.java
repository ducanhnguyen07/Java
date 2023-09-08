/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Administrator
 */
public class BienSoDep { 
    public static String check(String s) {
        int fl1 = 0;
        int fl2 = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) >= s.charAt(i+1)){
                fl1 = 1;
                break;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                fl2 = 1;
                break;
            }
        }
        if (s.charAt(0) == s.charAt(1) && 
            s.charAt(1) == s.charAt(2) &&
            s.charAt(2) == s.charAt(3) &&
            s.charAt(3) == s.charAt(4))
            return "YES";
        if (s.charAt(0) == s.charAt(1) && 
            s.charAt(1) == s.charAt(2) &&
            s.charAt(3) == s.charAt(4))
            return "YES";
        if(fl1 == 1 && fl2 == 1)
            return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            String tmp = "";
            for(int i=5; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i)))
                    tmp += s.charAt(i);
            }
            System.out.println(check(tmp));
        }
    }
}
