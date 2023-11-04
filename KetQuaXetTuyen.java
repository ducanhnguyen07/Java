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
class Nguoi{
    private String id;
    private String ten;
    private String dob;
    private double diemLT;
    private double diemTH;

    public Nguoi(int id, String ten, String dob, double diemLT, double diemTH) {
        this.id = "PH" + String.format("%02d", id);
        this.ten = ten;
        this.dob = dob;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    
    public int getTuoi(){
        return 2021 - Integer.parseInt(this.dob.substring(this.dob.lastIndexOf("/")+1));
    }
    
    public double getDiemThuong(){
        if(this.diemLT >= 8 && this.diemTH >= 8)
            return 1;
        else if(this.diemLT >= 7.5 && this.diemTH >= 7.5)
            return 0.5;
        return 0;
    }
    
    public int getDiemTB(){
        if((this.diemLT + this.diemTH)/2.0 + this.getDiemThuong() >= 10)
            return 10;
        return (int)Math.round((this.diemLT + this.diemTH)/2.0 + this.getDiemThuong());
    }
    
    public String getXepLoai(){
        if(this.getDiemTB() < 5)
            return "Truot";
        else if(this.getDiemTB() <= 6)
            return "Trung binh";
        else if(this.getDiemTB() == 7)
            return "Kha";
        else if(this.getDiemTB() == 8)
            return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.getTuoi() + " " + this.getDiemTB()
                + " " + this.getXepLoai();
    }
}

public class KetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Nguoi> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String dob = sc.nextLine();
            double diemLT = sc.nextDouble();
            double diemTH = sc.nextDouble();
            a.add(new Nguoi(i, ten, dob, diemLT, diemTH));
        }
        for(Nguoi i : a){
            System.out.println(i);
        }
    }
}
