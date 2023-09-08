/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class ChuanHoaXauHoTen2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            List<String> l = new ArrayList<>();
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                l.add(tmp);
            }
            for(int i=1; i<l.size(); i++) {
                System.out.printf(
            "%c%s", Character.toUpperCase(l.get(i).charAt(0)),
                       l.get(i).substring(1));
                if(i < l.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.printf(", %s", l.get(0).toUpperCase());
            System.out.println("");
        }
    }
}
