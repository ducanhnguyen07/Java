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
class MaHang{
    private String id;
    private double soLuong;

    public MaHang(String id, double soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }
    
    public int getSoLuongXuat(){
        double slXuat = this.soLuong;
        if(this.id.charAt(0) == 'A')
            slXuat *= 0.6;
        else slXuat *= 0.7;
        return (int)Math.round(slXuat);
    }
    
    public double getDonGia(){
        if(this.id.charAt(this.id.length()-1) == 'Y')
            return 110000;
        return 135000;
    }
    
    public double getTien(){
        return this.getSoLuongXuat() * this.getDonGia();
    }
    
    public double getThue(){
        if(this.id.charAt(0) == 'A' && 
                this.id.charAt(this.id.length()-1) == 'Y')
            return this.getTien() * 0.08;
        else if(this.id.charAt(0) == 'A' && 
                this.id.charAt(this.id.length()-1) == 'N')
            return this.getTien() * 0.11;
        else if(this.id.charAt(0) == 'B' && 
                this.id.charAt(this.id.length()-1) == 'Y')
            return this.getTien() * 0.17;
        return this.getTien() * 0.22;
    }

    @Override
    public String toString() {
        return String.format("%s %.0f %d %.0f %.0f %.0f", this.id, 
        this.soLuong, this.getSoLuongXuat(), this.getDonGia(), 
        this.getTien(), this.getThue());
    }
}

public class BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MaHang> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            double soLuong = sc.nextDouble();
            a.add(new MaHang(id, soLuong));
        }
        for(MaHang i : a){
            System.out.println(i);
        }
    }
}
