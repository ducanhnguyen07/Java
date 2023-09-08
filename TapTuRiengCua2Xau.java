/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Administrator
 */
public class TapTuRiengCua2Xau { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet<String> ts1 = new TreeSet<>();
            TreeSet<String> ts2 = new TreeSet<>();
            StringTokenizer st1 = new StringTokenizer(s1);
            StringTokenizer st2 = new StringTokenizer(s2);
            while(st1.hasMoreTokens()){
                ts1.add(st1.nextToken());
            }
            while(st2.hasMoreTokens()){
                ts2.add(st2.nextToken());
            }
            for(String s : ts1){
                if(!ts2.contains(s)) {
                    System.out.printf("%s ", s);
                }
            }
            System.out.println();
        }
    }
}
