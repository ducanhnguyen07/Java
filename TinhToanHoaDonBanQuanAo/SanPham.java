/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanHoaDonBanQuanAo;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class SanPham {
    private String maLoai;
    private String tenSanPham;
    private double gia1;
    private double gia2;

    public SanPham(String maLoai, String tenSanPham, double gia1, double gia2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGia1() {
        return gia1;
    }

    public double getGia2() {
        return gia2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f",
            this.maLoai, this.tenSanPham, this.gia1, this.gia2);
    }
}
