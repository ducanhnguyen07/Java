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

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.khoa;
    }
}

public class TimKiemGiangVien {
    public static String conv(String s){
        StringTokenizer st = new StringTokenizer(s);
        String res = "";
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
            String khoa = sc.nextLine();
            a.add(new GiangVien(i, ten, conv(khoa)));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            s = s.toLowerCase();
            for(GiangVien i : a){
                String name = i.getTen();
                if(name.toLowerCase().contains(s))
                    System.out.println(i);
            }
        }
    }
}
