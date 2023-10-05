/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom1;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String id;
    private String ten;
    private String sdt;
    private int stt;

    public SinhVien(String id, String ten, String sdt, int stt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.id, this.ten, this.sdt);
    }
}
