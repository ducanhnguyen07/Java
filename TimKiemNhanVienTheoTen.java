/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien1;

import java.util.*;
/**
 *
 * @author Administrator
 */
class NhanVien implements Comparable<NhanVien>{
    private String name;
    private String chucVu;
    private String soHieu;
    private String heSoLuong;

    public NhanVien(String id, String name) {
        this.name = name.trim();
        this.chucVu = id.substring(0, 2);
        this.soHieu = id.substring(4);
        this.heSoLuong = id.substring(2, 4);
        int cnt = Integer.parseInt(this.soHieu);
        if (this.chucVu.equals("GD") && cnt > 1) this.chucVu = "NV";
        else if ((this.chucVu.equals("TP") || (this.chucVu.equals("PP")))
                && cnt > 3) 
            this.chucVu = "NV";
    }

    public String getName() {
        return name;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    @Override
    public int compareTo(NhanVien b){
        if(!this.heSoLuong.equals(b.heSoLuong))
            return -this.heSoLuong.compareTo(b.heSoLuong);
        return this.soHieu.compareTo(b.soHieu);
    }

    @Override
    public String toString() {
        return this.name + " " + this.chucVu + " " + this.soHieu + " " + this.heSoLuong;
    }
}

public class TimKiemNhanVienTheoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String id = s[0];
            String name = "";
            for(int j=1; j<s.length; j++){
                name += s[j] + " ";
            }
            NhanVien x = new NhanVien(id, name.trim());
            a.add(x);
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<m; i++){
            String cmp = sc.nextLine().trim().toLowerCase();
            for(NhanVien j : a){
                if(j.getName().toLowerCase().contains(cmp))
                    System.out.println(j);
            }
            System.out.println();
        }
    }
}
