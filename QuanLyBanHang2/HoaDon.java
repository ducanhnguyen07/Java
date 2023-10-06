/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang2;

/**
 *
 * @author Administrator
 */
public class HoaDon implements Comparable<HoaDon>{
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
    
    public int getLoiNhuan(){
        return this.getTien() - this.b.getGiaMua()*this.soLuong;
    }
    
    @Override
    public int compareTo(HoaDon b){
        return -Integer.compare(this.getLoiNhuan(), b.getLoiNhuan());
    }

    @Override
    public String toString() {
        return this.maHD + " " + this.a.getTenKH() + " " + this.a.getDiaChi() 
            + " " + this.b.getTenMH() + " " + this.soLuong+ " " + this.getTien() 
            + " " + this.getLoiNhuan();
    }
}
