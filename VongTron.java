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

public class VongTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        int[] b = new int[26];
        Arrays.fill(a, -1);
        Arrays.fill(b, -1);
        for(int i=0; i<s.length(); i++){
            if(a[s.charAt(i)-'A'] == -1)
                a[s.charAt(i)-'A'] = i;
            else
                b[s.charAt(i)-'A'] = i;
        }
        int cnt = 0;
        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){
                if(a[i] < a[j] && b[i] < b[j] && a[j] < b[i])
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}