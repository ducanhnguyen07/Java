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
import java.io.*;

public class TimTuThuanNghichDaiNhat {
    public static boolean check(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> res = new LinkedHashMap<>();
        while(sc.hasNextLine()){
            String[] a = sc.nextLine().split("\\s+");
            for(String i : a){
                if(check(i)){
                    if(res.containsKey(i)){
                        res.put(i, res.get(i)+1);
                    }
                    else
                        res.put(i,1);
                }
            }
        }
        int maxx = 0;
        for(String i : res.keySet()){
            maxx = Math.max(i.length(), maxx);
        }
        for(String i : res.keySet()){
            if(i.length() == maxx)
                System.out.println(i + " " + res.get(i));
        }
    }
}
