/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

/**
 *
 * @author Administrator
 */
class ThiSinh{
    private String maThiSinh;
    private String hoten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinh(String maThiSinh, String hoten, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoten = hoten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public double getUuTien(){
        String s = this.maThiSinh.substring(0, 3);
        if(s.compareTo("KV1") == 0)
            return 0.5;
        if(s.compareTo("KV2") == 0)
            return 1.0;
        return 2.5;
    }
    
    public double getDiem(){
        return this.diemToan*2 + this.diemLy + this.diemHoa;
    }
    
    public String getKetQua(){
        if(getDiem() + getUuTien() < 24.0)
            return "TRUOT";
        return "TRUNG TUYEN";
    }

    @Override
    public String toString() {
        return this.maThiSinh + " " + this.hoten + " " + 
            ((int)getUuTien() == getUuTien() ? String.format("%d", (int)getUuTien()) : String.format("%.1f", getUuTien())) + " " +
            ((int)getDiem() == getDiem() ? String.format("%d", (int)getDiem()) : String.format("%.1f", getDiem())) + " " + 
            getKetQua();
    }
}

public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maThiSinh = sc.nextLine();
        String hoTen = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();
        ThiSinh a = new ThiSinh(maThiSinh, hoTen, diemToan, diemLy, diemHoa);
        System.out.println(a);
    }
}
