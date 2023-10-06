/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepHoaDonBanQuanAo;

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
}
