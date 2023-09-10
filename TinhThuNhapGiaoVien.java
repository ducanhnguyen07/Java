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
class GiaoVien{
    private String maNgach;
    private String hoTen;
    private long luongCoBan;

    public GiaoVien(String maNgach, String hoTen, long luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    
    public long getBacLuong(){
        String s = this.maNgach.substring(2);
        return Integer.valueOf(s);
    }
    
    public long getPhuCap(){
        String s = this.maNgach.substring(0, 2);
        if(s.compareTo("HT") == 0)
            return 2000000;
        else if(s.compareTo("HP") == 0)
            return 900000;
        return 500000;
    }
    
    public long getThuNhap(){
        return this.luongCoBan*getBacLuong() + getPhuCap();
    }

    @Override
    public String toString() {
        return  this.maNgach + " " + this.hoTen + " " + getBacLuong()
            + " " + getPhuCap() + " " + getThuNhap();
    }
    
}

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maNgach = sc.nextLine();
        String hoTen = sc.nextLine();
        long luongCoBan = sc.nextLong();
        GiaoVien a = new GiaoVien(maNgach, hoTen, luongCoBan);
        System.out.println(a);
    }
}
