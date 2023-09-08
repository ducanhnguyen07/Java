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

/**
 *
 * @author Administrator
 */
public class DayUuThe { 
    public static String check(List<Integer> l) {
        int cnto = 0;
        int cnte = 0;
        for(int i=0; i<l.size(); i++){
            if(l.get(i) % 2 == 0)
                cnte++;
            else
                cnto++;
        }
        if((cnte > cnto && l.size() % 2 == 0) || (cnte < cnto && l.size() % 2 != 0)) 
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            List<Integer> l = new ArrayList<>();
            while(st.hasMoreTokens()){
                int tmp = Integer.parseInt(st.nextToken());
                l.add(tmp);
            }
            System.out.println(check(l));
        }
    }
}
