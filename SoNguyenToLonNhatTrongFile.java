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
public class SoNguyenToLonNhatTrongFile {
    public static boolean check(int n){
        if(n < 2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i : a){
            if(check(i)){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i) + 1);
                }
                else{
                    tm.put(i, 1);
                }
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> i : tm.descendingMap().entrySet()){
            if(cnt < 10){
                System.out.println(i.getKey() + " " + i.getValue());
                cnt++;
            }
            else
                break;
        }
    }
}
