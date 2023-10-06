/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    private String maHD;
    private KhachHang a;
    private MatHang b;
    private int soLuong;

    public HoaDon() {
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setA(KhachHang a) {
        this.a = a;
    }

    public void setB(MatHang b) {
        this.b = b;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTien(){
        return this.soLuong * this.b.getGiaBan();
    }

    @Override
    public String toString() {
        return this.maHD + " " + this.a.getTenKH() + " " + this.a.getDiaChi() + " "
            + this.b.getTenMH() + " " + this.b.getDonViTinh() + " " + this.b.getGiaMua()
            + " " + this.b.getGiaBan() + " " + this.soLuong + " " + this.getTien();
    }
}
