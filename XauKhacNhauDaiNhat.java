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



public class XauKhacNhauDaiNhat {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equals(s2) == false){
                System.out.println(Integer.max(s1.length(), s2.length()));
            }
            else
                System.out.println("-1");
        }
    }
}