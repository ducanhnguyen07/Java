/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;
/**
 *
 * @author Administrator
 */
class HocSinh implements Comparable<HocSinh>{
    private String id;
    private String ten;
    private double toan, tv, ngoai, ly, hoa, sinh, su, dia, gdcd, cn;

    public HocSinh(int id, String ten, double toan, double tv, double ngoai, double ly, double hoa, double sinh, double su, double dia, double gdcd, double cn) {
        this.id = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.toan = toan;
        this.tv = tv;
        this.ngoai = ngoai;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.cn = cn;
    }
    
    public double getDiem(){
        return ((this.toan + this.tv)*2.0  + this.ngoai + this.ly + this.hoa +
                this.sinh + this.su + this.dia + this.gdcd + this.cn)/12.0;
    }
    
    public String getHK(){
        double d = this.getDiem();
        if(d >= 9.0)
            return "XUAT SAC";
        else if(d >= 8.0)
            return "GIOI";
        else if(d >= 7.0)
            return "KHA";
        else if(d >= 5.0)
            return "TB";
        else
            return "YEU";
    }
    
    @Override
    public int compareTo(HocSinh b){
        if(this.getDiem() != b.getDiem())
            return -Double.compare(this.getDiem(), b.getDiem());
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + String.format("%.1f", Math.round(this.getDiem() *10.f)/10.f) + " " + this.getHK();
    }
}

public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double toan = sc.nextDouble();
            double tv = sc.nextDouble();
            double ngoai = sc.nextDouble();
            double ly = sc.nextDouble();
            double hoa = sc.nextDouble();
            double sinh = sc.nextDouble();
            double su = sc.nextDouble();
            double dia = sc.nextDouble();
            double gdcd = sc.nextDouble();
            double cn = sc.nextDouble();
            a.add(new HocSinh(i, ten, toan, tv, ngoai, ly, hoa, sinh, su, dia, gdcd, cn));
        }
        Collections.sort(a);
        for(HocSinh i : a){
            System.out.println(i);
        }
    }
}
