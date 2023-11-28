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
class LoaiPhong implements Comparable<LoaiPhong>{
    private String KH;
    private String ten;
    private int donGia;
    private double phiPV;

    public LoaiPhong(String str) {
        String[] s = str.trim().split("\\s+");
        this.KH = s[0];
        this.ten = s[1];
        this.donGia = Integer.parseInt(s[2]);
        this.phiPV = Double.parseDouble(s[3]);
    }
    
    
    @Override
    public int compareTo(LoaiPhong b){
        return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
        return this.KH + " " + this.ten + " " + this.donGia + " " + this.phiPV;
    }
}

public class LOAIPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
