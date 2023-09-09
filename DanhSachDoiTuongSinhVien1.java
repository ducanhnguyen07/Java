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
class SinhVien{
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien(int maSinhVien, String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSinhVien = "B20DCCN" + String.format("%03d", maSinhVien);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
        
    public void ChuanHoa(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/')
            sb.insert(0, "0");
        if(sb.charAt(4) == '/')
            sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " +this.lop + " " +
            this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }   
}

public class DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien sv = new SinhVien(i, hoTen, lop, ngaySinh, gpa);
            sv.ChuanHoa();
            a.add(sv);
        }
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
