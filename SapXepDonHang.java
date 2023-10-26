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
class DonHang implements Comparable<DonHang>{
    private String id;
    private String ten;
    private double donGia;
    private double soLuong;

    public DonHang(String id, String ten, double donGia, double soLuong) {
        this.id = id;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public int getMaLoai(){
        return Integer.parseInt(this.id.substring(this.id.length()-1));
    }
    
    public double getGiamGia(){
        if(this.getMaLoai() == 1)
            return 0.5 * this.donGia * this.soLuong;
        return 0.3 * this.donGia * this.soLuong;
    }
    
    public double getThanhTien(){
        return this.donGia * this.soLuong - this.getGiamGia();
    }
    
    public String getSTT(){
        return this.id.substring(1, 4);
    }
    
    @Override
    public int compareTo(DonHang b){
        return this.getSTT().compareTo(b.getSTT());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f", this.ten, this.id,
                this.getSTT(), this.getGiamGia(), this.getThanhTien());
    }
}

public class SapXepDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String id = sc.nextLine();
            double donGia = sc.nextDouble();
            double soLuong = sc.nextDouble();
            a.add(new DonHang(id, ten, donGia, soLuong));
        }
        Collections.sort(a);
        for(DonHang i : a){
            System.out.println(i);
        }
    }
}
