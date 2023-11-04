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
class DonHang{
    private String id;
    private double soLuong;

    public DonHang(String id, double soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }
    
    public String getHSX(){
        if(this.id.substring(3).equals("BP"))
            return "British Petro";
        else if(this.id.substring(3).equals("ES"))
            return "Esso";
        else if(this.id.substring(3).equals("SH"))
            return "Shell";
        else if(this.id.substring(3).equals("CA"))
            return "Castrol";
        else if(this.id.substring(3).equals("MO"))
            return "Mobil";
        return "Trong Nuoc";
    }
    
    public double getDonGia(){
        if(this.id.charAt(0) == 'X')
            return 128000;
        else if(this.id.charAt(0) == 'D')
            return 11200;
        return 9700;
    }
    
    public double getThue(){
        double thue = this.getDonGia() * this.soLuong;
        if(this.id.charAt(0) == 'X')
            thue *= 0.03;
        else if(this.id.charAt(0) == 'D')
            thue *= 0.035;
        else 
            thue *= 0.02;
        if(this.getHSX().equals("Trong Nuoc"))
            return 0;
        return thue;
    }
    
    public double getThanhTien(){
        return this.soLuong * this.getDonGia() + this.getThue();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f", this.id, this.getHSX(),
                this.getDonGia(), this.getThue(), this.getThanhTien());
    }
}

public class QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.next();
            double soLuong = sc.nextDouble();
            a.add(new DonHang(id, soLuong));
        }
        for(DonHang i : a){
            System.out.println(i);
        }
    }
}
