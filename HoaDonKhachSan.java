/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Administrator
 */
class KhachHang implements Comparable<KhachHang>{
    private String id;
    private String ten;
    private String soPhong;
    private String ngayNhanPhong;
    private String ngayTraPhong;
    private long tienDV;

    public KhachHang(int id, String ten, String soPhong, String ngayNhanPhong, String ngayTraPhong, long tienDV) {
        this.id = "KH" + String.format("%02d", id);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.tienDV = tienDV;
    }
    
    private long getSoNgayO(){
        String[] s1 = this.ngayNhanPhong.trim().split("/");
        String[] s2 = this.ngayTraPhong.trim().split("/");
        int y1 = Integer.parseInt(s1[2]), 
            m1 = Integer.parseInt(s1[1]), 
            d1 = Integer.parseInt(s1[0]);
        int y2 = Integer.parseInt(s2[2]), 
            m2 = Integer.parseInt(s2[1]), 
            d2 = Integer.parseInt(s2[0]);
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);
        return ChronoUnit.DAYS.between(date1, date2) + 1;
    }
    
    private long getThanhTien(){
        long tang = Integer.parseInt(this.soPhong.substring(0, 1));
        if(tang == 1){
            return 25 * this.getSoNgayO() + this.tienDV;
        }
        else if(tang == 2){
            return 34 * this.getSoNgayO() + this.tienDV;
        }
        else if(tang == 3){
            return 50 * this.getSoNgayO() + this.tienDV;
        }
        return 80 * this.getSoNgayO() + this.tienDV;
    }
    
    @Override
    public int compareTo(KhachHang b){
        return -Long.compare(this.getThanhTien(), b.getThanhTien());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", this.id, this.ten, this.soPhong, 
                        this.getSoNgayO(), this.getThanhTien());
    }
}

public class HoaDonKhachSan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String soPhong = sc.nextLine();
            String ngayNhanPhong = sc.nextLine();
            String ngayTraPhong = sc.nextLine();
            long tienDV = sc.nextLong();
            a.add(new KhachHang(i, ten, soPhong, ngayNhanPhong, ngayTraPhong, tienDV));
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
