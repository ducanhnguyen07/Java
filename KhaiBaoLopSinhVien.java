/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

class SinhVien {
    private String msv;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien() {
        
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double getGpa() {
        return gpa;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
    
    public static String conv(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/')
            sb.insert(0, "0");
        if(sb.charAt(4) == '/')
            sb.insert(3, "0");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        String hoTen =  sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double gpa = sc.nextDouble();
        String ns = conv(ngaySinh);
        sv.setMsv("B20DCCN001");
        sv.setHoTen(hoTen);
        sv.setLop(lop);
        sv.setNgaySinh(ns);
        sv.setGpa(gpa);
        System.out.println(sv);
    }
}
