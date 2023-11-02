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
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) {
        try {
            DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
            HashMap<Integer, Integer> m = new HashMap<>();
            for(int i=0; i<100000; i++){
                int x = sc.readInt();
                if(m.containsKey(x))
                    m.put(x, m.get(x)+1);
                else
                    m.put(x, 1);
            }
            for(Map.Entry<Integer, Integer> i : m.entrySet()){
                System.out.println(i.getKey() + " " + i.getValue());
            }   
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}