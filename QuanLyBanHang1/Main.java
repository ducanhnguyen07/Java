/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        ArrayList<MatHang> mh = new ArrayList<>();
        ArrayList<HoaDon> hd = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            
            String tenKH = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            kh.add(new KhachHang(i, tenKH, gioiTinh, ngaySinh, diaChi));
        }
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            sc.nextLine();
            String tenMH = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();     
            mh.add(new MatHang(i, tenMH, donViTinh, giaMua, giaBan));
        }
        int k = sc.nextInt();
        for(int i=1; i<=k; i++){
            sc.nextLine();
            String maKhachHang = sc.next();
            String maMatHang = sc.next();
            int soLuong = sc.nextInt();
            HoaDon x = new HoaDon();
            x.setMaHD("HD" + String.format("%03d", i));
            x.setSoLuong(soLuong);
            for(KhachHang j : kh){
                if(j.getMaKH().equals(maKhachHang)){
                    x.setA(j);
                    break;
                }
            }
            for(MatHang j : mh){
                if(j.getMaMH().equals(maMatHang)){
                    x.setB(j);
                    break;
                }
            }
//            hd.add(x);
            System.out.println(x);
        }
//        for(HoaDon i : hd){
//            System.out.println(i);
//        }
    }
}
