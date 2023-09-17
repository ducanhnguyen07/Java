/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;

class IntSet{
    private TreeSet<Integer> a;

    public IntSet(int[] a) {
        this.a = new TreeSet<>();
        for(int i : a){
            this.a.add(i);
        }
    }
    
    public IntSet(TreeSet<Integer> a) {
        this.a = a;
    }
    
    public IntSet union(IntSet b){
        TreeSet<Integer> c = this.a;
        for(Integer i : b.a){
            c.add(i);
        }
        return new IntSet(c);
    }

    @Override
    public String toString() {
        String res = "";
        for(Integer i : this.a){
            res += i.toString() + " ";
        }
        return res;
    }
}

/**
 *
 * @author Administrator
 */
public class LopIntSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
