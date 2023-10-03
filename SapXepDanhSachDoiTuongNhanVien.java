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
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKy;

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.id = String.format("%05d", id);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = ngayKy;
    }
    
    public String getNgaySinh(){
        String s = this.ngaySinh.substring(6);
        s += this.ngaySinh.substring(3, 5);
        s += this.ngaySinh.substring(0, 2);
        return s;
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
            + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKy; 
    }
}

public class SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKy = sc.nextLine();
            a.add(new NhanVien(i+1, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy));
        }
        Collections.sort(a, new Comparator<NhanVien>(){
            public int compare(NhanVien o1, NhanVien o2){
                return o1.getNgaySinh().compareTo(o2.getNgaySinh());
            }
        });
        for(NhanVien i : a){
            System.out.println(i);
        }
    }
}
