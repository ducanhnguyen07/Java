/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class TinhTong {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            ArrayList<Integer> a = new ArrayList<>();
            while(sc.hasNext()){
                String s = sc.nextLine();
                String[] x = s.split("\\s+");
                for(int i=0; i<x.length; i++){
                    if(x[i].length() <= 9 && x[i].matches("\\d+")){
                        a.add(Integer.parseInt(x[i]));
                    }
                }
            }
            long res = 0;
            for(int i : a){
                res += i;
            }
            System.out.println(res);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
