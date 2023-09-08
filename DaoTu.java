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
public class DaoTu { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            List<String> l = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                l.add(st.nextToken());
            }
            for(int i=0; i<l.size(); i++){
                String x = l.get(i);
                for(int j=x.length()-1; j>=0; j--){
                    System.out.printf("%c", x.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
