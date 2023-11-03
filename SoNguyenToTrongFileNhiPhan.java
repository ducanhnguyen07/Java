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
public class SoNguyenToTrongFileNhiPhan {
    public static boolean check(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(int i : a){
            if(check(i)){
                if(m.containsKey(i))
                    m.put(i, m.get(i)+1);
                else
                    m.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : m.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
