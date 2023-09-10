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
class NhanVien{
    private String id;
    private String hoten;
    private double luongCoBan;
    private double soNgayCong;
    private String chucVu;

    public NhanVien(String id, String hoten, double luongCoBan, double soNgayCong, String chucVu) {
        this.id = id;
        this.hoten = hoten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }
    
    public double getLuong(){
        return this.luongCoBan * this.soNgayCong;
    }
    
    public double getThuong(){
        if(this.soNgayCong >= 25.0){
            return getLuong()*0.2;
        }
        else if(this.soNgayCong >= 22.0){
            return getLuong()*0.1;
        }
        return 0.0;
    }
    
    public double getPhuCap(){
        if(this.chucVu.compareTo("GD") == 0)
            return 250000.0;
        if(this.chucVu.compareTo("PGD") == 0)
            return 200000.0;
        if(this.chucVu.compareTo("TP") == 0)
            return 180000.0;
        return 150000.0;
    }
    
    public double getThuNhap(){
        return getLuong() + getThuong() + getPhuCap();
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoten + " " + (long)getLuong() + " " + (long)getThuong()
            + " " + (long)getPhuCap() + " " + (long)getThuNhap();
    }    
}

public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        double luongCoBan = sc.nextDouble();
        double soNgayCong = sc.nextDouble();
        sc.nextLine();
        String chucVu = sc.nextLine();
        String id = "NV01";
        NhanVien a = new NhanVien(id, hoTen, luongCoBan, soNgayCong, chucVu);
        System.out.println(a);
    }
}
