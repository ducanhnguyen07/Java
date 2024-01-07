/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class Pair<X extends Comparable, Y extends Comparable> implements Comparable<Pair>{
    private X fi;
    private Y sc;

    public Pair(X fi, Y sc) {
        this.fi = fi;
        this.sc = sc;
    }
    
    @Override
    public int compareTo(Pair b){
        if(this.sc != b.sc)
            return -this.sc.compareTo(b.sc);
        return this.fi.compareTo(b.fi);
    }

    @Override
    public String toString() {
        return this.fi.toString() + " " + this.sc.toString();
    }
}

public class ThongKeTuKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inp = new FileInputStream("DATA.in");
        ObjectInputStream sc = new ObjectInputStream(inp);
        ArrayList<String> a = (ArrayList<String>)sc.readObject();

        TreeMap<String, Integer> tm = new TreeMap<>();
         for(String i : a){
            String[] tmp = i.toLowerCase().split("[^a-z0-9]+");
            for(String t : tmp){
                if(!t.isEmpty())
                    tm.put(t, tm.getOrDefault(t, 0) + 1);
            }
        }
        
        ArrayList<Pair<String, Integer>> res = new ArrayList<>();
        for(Map.Entry<String, Integer> i : tm.entrySet()){
            res.add(new Pair<>(i.getKey(), i.getValue()));
        }
        Collections.sort(res);
        for(Pair i : res){
            System.out.println(i);
        }
        inp.close();
    }
}
