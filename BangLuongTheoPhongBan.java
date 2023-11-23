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
class PhongBan{
    private String id;
    private String tenPhong;

    public PhongBan(String id, String tenPhong) {
        this.id = id;
        this.tenPhong = tenPhong;
    }

    public String getId() {
        return id;
    }

    public String getTenPhong() {
        return tenPhong;
    }
}

class NhanVien{
    private String id;
    private String ten;
    private String tenPB;
    private int luong;
    private int soNgay;

    public NhanVien(String id, String ten, int luong, int soNgay) {
        this.id = id;
        this.ten = ten;
        this.luong = luong;
        this.soNgay = soNgay;
    }

    public String getId() {
        return id;
    }

    public String getTenPB() {
        return tenPB;
    }
    
    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }
    
    public int getLuong(){
        char c = this.id.charAt(0);
        int idx = Character.valueOf(c) - Character.valueOf('A');
        int nam = Integer.parseInt(this.id.substring(1, 3));
        int[][] m = {{10, 12, 14, 20},
                     {10, 11, 13, 16},
                     {9, 10, 12, 14},
                     {8, 9, 11, 13}};
        if(nam <= 3)
            return this.luong * this.soNgay * m[idx][0] * 1000;
        else if(nam <= 8)
            return this.luong * this.soNgay * m[idx][1] * 1000;
        else if(nam <= 15)
            return this.luong * this.soNgay * m[idx][2] * 1000;
        return this.luong * this.soNgay * m[idx][3] * 1000;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.getLuong();
    }
}

public class BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<PhongBan> p = new ArrayList<>();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] s = sc.nextLine().split("\\s+");
            String id = s[0];
            String tenPhong = "";
            for(int j=1; j<s.length; j++){
                tenPhong += s[j] + " ";
            }
            p.add(new PhongBan(id, tenPhong.trim()));
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            int luong = sc.nextInt();
            int soNgay = sc.nextInt();
            NhanVien x = new NhanVien(id, ten, luong, soNgay);
            for(PhongBan j : p){
                if(j.getId().equals(id.substring(3))){
                    x.setTenPB(j.getTenPhong());
                    break;
                }
            }
            a.add(x);
        }
        sc.nextLine();
        String pb = sc.nextLine();
        String phong = "";
        for(PhongBan i : p){
            if(i.getId().equals(pb)){
                phong = i.getTenPhong();
                break;
            }
        }
        System.out.print("Bang luong phong " + phong + ":\n");
        for(NhanVien i : a){
            if(i.getTenPB().equals(phong)){
                System.out.println(i );
            }
        }
    }
}
