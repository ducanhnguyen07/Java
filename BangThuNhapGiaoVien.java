/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;

/**
 *
 * @author Administrator
 */
class GiaoVien{
    private String maNgach;
    private String ten;
    private double luongCB;

    public GiaoVien(String maNgach, String ten, double luongCB) {
        this.maNgach = maNgach;
        this.ten = ten;
        this.luongCB = luongCB;
    }
    
    public String getChucVu(){
        return this.maNgach.substring(0, 2);
    }
    
    public double getHeSo(){
        return Double.parseDouble(this.maNgach.substring(2));
    }
    
    public double getPhuCap(){
        if(this.getChucVu().equals("HT"))
            return 2000000;
        else if(this.getChucVu().equals("HP"))
            return 900000;
        return 500000;
    }
    
    public double getThuNhap(){
        return this.luongCB * this.getHeSo() + this.getPhuCap();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f", this.maNgach, this.ten,
                this.getHeSo(), this.getPhuCap(), this.getThuNhap());
    }
}

public class BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<GiaoVien> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String maNgach = sc.nextLine();
            String ten = sc.nextLine();
            double luongCB = sc.nextDouble();
            a.add(new GiaoVien(maNgach, ten, luongCB));
        }
        int cnt_HT = 0;
        int cnt_HP = 0;
        for(GiaoVien i : a){
            if(i.getChucVu().equals("GV"))
                System.out.println(i);
            else if(i.getChucVu().equals("HT") && cnt_HT < 1){
                System.out.println(i);
                cnt_HT++;
            }
            else if(i.getChucVu().equals("HP") && cnt_HP < 2){
                System.out.println(i);
                cnt_HP++;
            }                
        }
    }
}
