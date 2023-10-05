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
class GiangVien{
    private String id;
    private String ten;
    private String khoa;

    public GiangVien(int id, String ten, String khoa) {
        this.id = "GV" + String.format("%02d", id);
        this.ten = ten;
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.khoa;
    }
}

public class DanhSachGiangVienTheoBoMon {
    public static String conv(String s){
        String res = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            res += st.nextToken().charAt(0);
        }
        return res.toUpperCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiangVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String khoa = conv(s);
            a.add(new GiangVien(i, ten, khoa));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = conv(s);
            System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
            for(GiangVien i : a){
                if(i.getKhoa().equals(s))
                    System.out.println(i);
            }
        }
    }
}
