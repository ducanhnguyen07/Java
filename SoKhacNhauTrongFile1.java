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
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            HashMap<Integer, Integer> m = new HashMap<>();
            while(sc.hasNext()){
                String s = sc.nextLine();
                String[] a = s.split("\\s+");
                for(String i : a){
                    if(m.containsKey(Integer.valueOf(i)))
                        m.put(Integer.valueOf(i), m.get(Integer.valueOf(i))+1);
                    else
                        m.put(Integer.valueOf(i), 1);
                }
            }
            for(Map.Entry<Integer, Integer> i : m.entrySet()){
                System.out.println(i.getKey() + " " + i.getValue());
            }   
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
