/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Administrator
 */
class NhanVien{
    private String id;
    private String ten;
    private String chucVu;
    private double luong;
    private double ngay;

    public NhanVien(int id, String ten, String chucVu, double luong, double ngay) {
        this.id = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngay = ngay;
    }

    public String getChucVu() {
        return chucVu;
    }
    
    public double getLuongChinh(){
        return this.luong * this.ngay;
    }
    
    public double getPhuCap(){
        if(this.chucVu.compareTo("GD") == 0)
            return 500;
        else if (this.chucVu.compareTo("PGD") == 0)
            return 400;
        else if(this.chucVu.compareTo("TP") == 0)
            return 300;
        else if(this.chucVu.compareTo("KT") == 0)
            return 250;
        return 100;
    }
    
    public int getTamUng(){
        double sum = this.getLuongChinh() + this.getPhuCap();
        if(sum * 2/3 < 25000) 
            return (int)Math.round((sum * 2/3) / 1000) * 1000;
        return 25000;
    }
    
    public double getConLai(){
        return this.getLuongChinh() + this.getPhuCap() - (double)this.getTamUng();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %d %.0f", this.id, this.ten,
            this.getPhuCap(), this.getLuongChinh(), this.getTamUng(), this.getConLai());
    }
}

public class LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String chucVu = sc.nextLine();
            double luong = sc.nextDouble();
            double ngay = sc.nextDouble();
            a.add(new NhanVien(i, ten, chucVu, luong, ngay));
        }
        sc.nextLine();
        String s = sc.nextLine();
        for(NhanVien i : a){
            if(i.getChucVu().compareTo(s) == 0)
                System.out.println(i);
        }
    }
}
