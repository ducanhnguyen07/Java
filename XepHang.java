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
import java.util.Scanner;

public class XepHang {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                    tmp = b[i]; b[i] = b[j]; b[j] = tmp;
                }
            }
        }
        long sum = a[0];
        for(int i=0; i<n-1; i++){
            if(sum + b[i] > a[i+1]){
                sum += b[i];
            }
            else
                sum = a[i+1];
        }
        sum += b[n-1];
        System.out.println(sum);        
    }
}