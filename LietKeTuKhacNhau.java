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
class WordSet{
    private TreeSet<String> ts;

    public WordSet(String fname) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fname));
        this.ts = new TreeSet<>();
        while(sc.hasNext()){
            String[] s = sc.nextLine().split("\\s+");
            for(String i : s){
                ts.add(i.toLowerCase());
            }
        }
    }
    
    private String getData(){
        String res = "";
        for(String i : this.ts){
            res += i + "\n";
        }
        return res;
    }

    @Override
    public String toString() {
        return this.getData();
    }
}

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }

}
