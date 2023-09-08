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
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class KhoangCachNhoHonK { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int idx = 0;
            long cnt = 0;
            for(int i=1; i<n; i++){
                while(idx < i && a[idx] + k <= a[i]) 
                    idx++;
                cnt += i - idx;
            }
            System.out.println(cnt);
        }
    }
}
