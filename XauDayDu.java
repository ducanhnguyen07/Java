/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Administrator
 */

import java.util.*;
import java.math.*;
import java.io.*;

public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            TreeSet<Character> ts = new TreeSet<>();
            for(int i=0; i<s.length(); i++)
                ts.add(s.charAt(i));
            if(ts.size() + k >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
