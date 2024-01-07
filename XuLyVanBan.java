/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNextLine()){
            s += sc.nextLine().toLowerCase();
        }
        ArrayList<String> b = new ArrayList<>();
        String[] tmp = s.trim().toLowerCase().split("[.?!]");
        for(String j : tmp){
            b.add(j);
        }
        for(String i : b){
            String[] t = i.split("\\s+");
            String res = "";
            
            for(int j=0; j<t.length; j++){
                res += t[j] + " ";
            }
            res = res.trim();
            if(res.length() > 1){
                System.out.println(Character.toString(res.charAt(0)).toUpperCase()
                                    + res.substring(1));
            }
            else
                System.out.println(res.toUpperCase());
        }
    }
}
