/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom1;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        DanhSach[] res = new DanhSach[m];
        for (int i = 0; i < res.length; i++) {
            res[i] = new DanhSach();
        }
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();
            int stt = sc.nextInt();
            res[stt-1].getA().add(new SinhVien(id, ten, sdt, stt));
        }
        String[] list = new String[m];
        sc.nextLine();
        for(int i=0; i<m; i++){
            list[i] = sc.nextLine();
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int q = sc.nextInt();
            System.out.println("DANH SACH NHOM " + q + ":");
            for(SinhVien i : res[q-1].getA()){
                System.out.println(i);
            }
            System.out.println("Bai tap dang ky: " + list[q-1]);
        }
    }
}
