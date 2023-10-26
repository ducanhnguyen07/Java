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
class ThiSinh{
    private String id;
    private String hoTen;
    private double toan;
    private double ly;
    private double hoa;

    public ThiSinh(String id, String hoTen, double toan, double ly, double hoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double getUuTien(){
        if(this.id.substring(0, 3).equals("KV1"))
            return 0.5;
        else if(this.id.substring(0, 3).equals("KV2"))
            return 1.0;
        return 2.5;
    }
    
    public double getTong(){
        return this.toan * 2 + this.ly + this.hoa;
    }
    
    public String getTrangThai(){
        if(this.getTong() + this.getUuTien() < 24)
            return "TRUOT";
        return "TRUNG TUYEN";
    }
    
    public String conv(double x){
        if((int)x == x)
            return String.format("%.0f", x);
        return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + conv(this.getUuTien())
            + " " + conv(this.getTong()) + " " + this.getTrangThai();
    }
}

public class BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String hoTen = sc.nextLine();
            double toan = sc.nextDouble();
            double ly = sc.nextDouble();
            double hoa = sc.nextDouble();
            a.add(new ThiSinh(id, hoTen, toan, ly, hoa));
        }
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }
}
