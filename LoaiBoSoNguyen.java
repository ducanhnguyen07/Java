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
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String[] s = sc.nextLine().trim().split("\\s+");
            for(String i : s){
                if(i.length() > 9 || i.matches("\\d+") == false)
                    a.add(i);
            }
        }
        Collections.sort(a);
        for(String i : a){
            System.out.print(i + " ");
        }
    }
}
