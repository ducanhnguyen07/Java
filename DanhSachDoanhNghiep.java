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
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id;
    private String name;
    private int numStu;

    public DoanhNghiep(String id, String name, int numStu) {
        this.id = id;
        this.name = name;
        this.numStu = numStu;
    }
    
    @Override
    public int compareTo(DoanhNghiep b){
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.numStu;
    }
}

public class DanhSachDoanhNghiep {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = sc.nextInt();
            ArrayList<DoanhNghiep> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                sc.nextLine();
                String id = sc.nextLine();
                String name = sc.nextLine();
                int numStu = sc.nextInt();
                a.add(new DoanhNghiep(id, name, numStu));
            }
            Collections.sort(a);
            for(DoanhNghiep i : a){
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
