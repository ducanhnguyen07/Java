/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        char maxx = s.charAt(s.length()-1);
        for(int i=s.length()-1; i>=0; i--){
            if(maxx <= s.charAt(i)){
                res += s.charAt(i);
                maxx = s.charAt(i);
            }
        }
        StringBuffer sb = new StringBuffer(res);
        sb.reverse();
        System.out.println(sb);
    }
}
