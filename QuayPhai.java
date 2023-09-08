/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
/**
 *
 * @author Administrator
 */

import java.io.*;
import java.util.*;
import java.math.*;

public class QuayPhai {
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n+5];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            int cnt = 1;
            for(int i=0; i<n-1; i++){
                if(a[i] <= a[i+1]) 
                    cnt++;
                else
                    break;
            }
            if(cnt < n)
                System.out.println(cnt);
            else
                System.out.println("0");
        }
    }
}