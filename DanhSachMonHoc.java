/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class MonHoc implements Comparable<MonHoc>{
    private String id;
    private String name;
    private int creditNum;

    public MonHoc(String id, String name, int creditNum) {
        this.id = id;
        this.name = name;
        this.creditNum = creditNum;
    }
    
    @Override
    public int compareTo(MonHoc b){
        return this.name.compareTo(b.name);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.creditNum;
    }
}

public class DanhSachMonHoc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            ArrayList<MonHoc> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                sc.nextLine();
                String id = sc.nextLine();
                String name = sc.nextLine();
                int creditNum = sc.nextInt();
                a.add(new MonHoc(id, name, creditNum));
            }
            Collections.sort(a);
            for(MonHoc i : a){
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
