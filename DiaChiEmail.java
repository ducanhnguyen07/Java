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
public class DiaChiEmail { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> l = new ArrayList<>();
        while(t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            String res = "";
            List<String> tmp = new ArrayList<>();
            while(st.hasMoreTokens()){
                tmp.add(st.nextToken());
            }
            res += tmp.get(tmp.size()-1);
            for(int i=0; i<tmp.size()-1; i++){
                res += tmp.get(i).charAt(0);
            }
            
            l.add(res);
        }
        for(int i=0; i<l.size(); i++){
            int cnt = 1;
            for(int j=i-1; j>=0; j--){
                if(l.get(i).compareTo(l.get(j)) == 0){
                    cnt++;
                }
            }
            String x = "";
            if(cnt > 1){
                x = l.get(i).concat(String.valueOf(cnt));
            }
            else{
                x = l.get(i);
            }
            System.out.printf("%s@ptit.edu.vn", x);
            System.out.println();
        }
    }
}
