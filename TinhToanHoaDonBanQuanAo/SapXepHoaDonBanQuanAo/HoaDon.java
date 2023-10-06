/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepHoaDonBanQuanAo;

/**
 *
 * @author Administrator
 */
public class HoaDon implements Comparable<HoaDon>{
    private String id;
    private String tenSP;
    private double soLuong;
    private double tienGoc;

    public HoaDon(String id, double soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public double getSoLuong() {
        return soLuong;
    }
    
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setTienGoc(double tienGoc) {
        this.tienGoc = tienGoc;
    }

    public double getTienGiam(){
        double thanhTien = this.tienGoc*this.soLuong;
        if((int)this.soLuong >= 150)
            return thanhTien*0.5;
        else if((int)this.soLuong >= 100)
            return thanhTien*0.3;
        else if((int)this.soLuong >= 50)
            return thanhTien*0.15;
        else 
            return 0;
    }
    
    public double getTienTra(){
        return this.tienGoc*this.soLuong - this.getTienGiam();
    }
    
    @Override
    public int compareTo(HoaDon b){
        return -Double.compare(this.getTienTra(), b.getTienTra());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f",
            this.id, this.tenSP, this.getTienGiam(), this.getTienTra());
    }
}
