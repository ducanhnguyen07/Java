/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Administrator
 */
class NhanVien implements Comparable<NhanVien>{
    private String id;
    private String ten;
    private double luong;
    private double ngay;
    private String chucVu;

    public NhanVien(int id, String ten, double luong, double ngay, String chucVu) {
        this.id = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.chucVu = chucVu;
    }
    
    public double getLuongThang(){
        return this.luong * this.ngay;
    }
    
    public double getThuong(){
        if(this.ngay >= 25)
            return this.getLuongThang() * 0.2;
        else if(this.ngay >= 22)
            return this.getLuongThang() * 0.1;
        return 0;
    }
    
    public double getPhuCap(){
        if(this.chucVu.compareTo("GD") == 0)
            return 250000;
        else if(this.chucVu.compareTo("PGD") == 0)
            return 200000;
        else if(this.chucVu.compareTo("TP") == 0)
            return 180000;
        return 150000;
    }
    
    public double getTong(){
        return this.getLuongThang() + this.getPhuCap() + this.getThuong();
    }
    
    @Override
    public int compareTo(NhanVien b){
        return -Double.compare(this.getTong(), b.getTong());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",
        this.id, this.ten, 
        this.getLuongThang(), this.getThuong(), this.getPhuCap(), this.getTong());
    }
}
public class SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ten = sc.nextLine();
            double luong = sc.nextDouble();
            double ngay = sc.nextDouble();
            sc.nextLine();
            String chucVu = sc.nextLine();
            a.add(new NhanVien(i, ten, luong, ngay, chucVu));
        }
        Collections.sort(a);
        for(NhanVien i : a){
            System.out.println(i);
        }
    }
}
