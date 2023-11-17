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
class MatHang{
    private String id;
    private String ten;
    private String xepLoai;
    private double donGia;
    private double soLuongNhap;
    private double soLuongXuat;

    public MatHang(String id, String ten, String xepLoai) {
        this.id = id;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getId() {
        return id;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuongNhap(double soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public void setsoLuongXuat(double soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }
    
    public double getTongNhap(){
        return this.donGia * this.soLuongNhap;
    }
    
    public double getTongXuat(){
        double xuat = this.donGia * this.soLuongXuat;
        if(this.xepLoai.equals("A"))
            return xuat * 1.08;
        else if(this.xepLoai.equals("B"))
            return xuat * 1.05;
        return xuat * 1.02;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f", this.id, this.ten,
                this.getTongNhap(), this.getTongXuat());
    }
}

public class NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String xepLoai = sc.nextLine();
            a.add(new MatHang(id, ten, xepLoai));
        }
        int m = sc.nextInt();
        ArrayList<String> aStr = new ArrayList<>();
        for(int i=0; i<m; i++){
            sc.nextLine();
            String id = sc.next();
            int soLuongNhap = sc.nextInt();
            int donGia = sc.nextInt();
            int soLuongXuat = sc.nextInt();
            for(int j=0; j<n; j++){
                if(a.get(j).getId().equals(id)){
                    a.get(j).setDonGia(donGia);
                    a.get(j).setSoLuongNhap(soLuongNhap);
                    a.get(j).setsoLuongXuat(soLuongXuat);
                    aStr.add(a.get(j).toString());
                    break;
                }
            }
        }
        for(String i : aStr){
            System.out.println(i);
        }
    }
}
