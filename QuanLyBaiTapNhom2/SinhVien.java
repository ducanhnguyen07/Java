/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom2;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String ten;
    private String sdt;
    private int stt;
    private String de;

    public SinhVien(String id, String ten, String sdt, int stt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public void setDe(String de) {
        this.de = de;
    }
    
    @Override
    public int compareTo(SinhVien b){
        return this.id.compareTo(b.id);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d %s", 
                this.id, this.ten, this.sdt, this.stt, this.de);
    }
}
