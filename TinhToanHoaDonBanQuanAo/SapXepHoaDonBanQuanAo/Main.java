/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepHoaDonBanQuanAo;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SanPham> sp = new ArrayList<>();
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String maLoai = sc.nextLine();
            String tenSanPham = sc.nextLine();
            double gia1 = sc.nextDouble();
            double gia2 = sc.nextDouble();
            sp.add(new SanPham(maLoai, tenSanPham, gia1, gia2));
        }
        int shd = sc.nextInt();
        for(int i=0; i<shd; i++){
            sc.nextLine();
            String id = sc.next();
            double soLuong = sc.nextDouble();
            hd.add(new HoaDon(id + "-" + String.format("%03d", i+1), 
                    soLuong));
        }
        for(HoaDon i : hd){
            for(SanPham j : sp){
                if(j.getMaLoai().equals(i.getId().substring(0, 2))){
                    i.setTenSP(j.getTenSanPham());
                    if(i.getId().charAt(2) == '1'){
                        i.setTienGoc(j.getGia1());
                    }
                    else
                        i.setTienGoc(j.getGia2());
                    break;
                }
            }
        }
        Collections.sort(hd);
        for(HoaDon i : hd){
            System.out.println(i);
        }
    }
}
