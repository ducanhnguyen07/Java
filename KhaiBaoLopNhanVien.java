/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

/**
 *
 * @author Administrator
 */
class NhanVien{
    private String id;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKy;

    public NhanVien(String id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = ngayKy;
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.gioiTinh + " " + 
            this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKy;
    }
}

public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String ngayKy = sc.nextLine();
        String id = "00001";
        NhanVien nv = new NhanVien(id, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy);
        System.out.println(nv);
    }
}
