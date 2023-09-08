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
public class SoUuThe { 
    public static String check(String s) {
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i)))
                return "INVALID";
        }
        int cntOdd = 0;
        int cntEven = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.getNumericValue(s.charAt(i)) % 2 == 0)
                cntEven++;
            else
                cntOdd++;
        }
        if((cntEven > cntOdd && s.length() % 2 == 0) || (cntEven < cntOdd && s.length() % 2 != 0))
            return "YES";
        return "NO";
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
