/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class DemSoLanXuatHien { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q = t;
        while(t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> mp = new HashMap<>();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int x : a){
                if(mp.containsKey(x)) {
                    int freq = mp.get(x);
                    mp.put(x, freq + 1);
                }
                else {
                    mp.put(x, 1);
                }
            }
            System.out.println("Test " + (q - t) + ":");
            for(int x : a) {
                if(mp.containsKey(x)) {
                    System.out.println(x + " xuat hien " + mp.get(x) + " lan");
                    mp.remove(x);
                }
            }
        }
    }   
}
