/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;

/**
 *
 * @author Administrator
 */
class WordSet{
    private TreeSet<String> ts;

    public WordSet(String s) {
        this.ts = new TreeSet<>();
        for(String i : s.trim().toLowerCase().split("\\s+")){
            this.ts.add(i);
        }
    }

    public WordSet(TreeSet<String> ts) {
        this.ts = ts;
    }
    
    public WordSet union(WordSet x){
        TreeSet<String> res = new TreeSet<>();
        res.addAll(this.ts);
        res.addAll(x.ts);
        return new WordSet(res);
    }
    
    public WordSet intersection(WordSet x){
        TreeSet<String> res = new TreeSet<>();
        for(String i : this.ts){
            if(x.ts.contains(i)){
                res.add(i);
            }
        }
        return new WordSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(String i : this.ts){
            res += i + " ";
        }
        return res.trim();
    }
}

public class LopWordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
