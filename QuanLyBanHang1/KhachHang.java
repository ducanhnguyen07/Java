/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Administrator
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang(int maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = "KH" + String.format("%03d", maKH);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
