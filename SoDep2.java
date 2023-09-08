/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class SoDep2 { 
    public static boolean check(String s) {
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8'){
            return false;
        }
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        if(sum % 10 != 0){
            return false;
        }
        return true;
    }
    
    public static boolean checkPld(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(check(s) && checkPld(s) ? "YES" : "NO");
        }
    }
}
