/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class MatHang{
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = "MH" + String.format("%03d", maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }
       
    public int getMoney(){
        return this.giaBan - this.giaMua;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenMatHang + " " + this.donViTinh + " " +
            this.giaMua + " " + this.giaBan + " " + this.getMoney();
    }
    
}

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            a.add(new MatHang(i, tenMatHang, donViTinh, giaMua, giaBan));
        }
        Collections.sort(a, new Comparator<MatHang>(){
            public int compare(MatHang a, MatHang b){
                if(a.getMoney() != b.getMoney())
                    return b.getMoney() - a.getMoney();
                else 
                    return a.getMaMatHang().compareTo(b.getMaMatHang());
            }
        });
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
