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
class SinhVien{
    private String id;
    private String ten;
    private String lop;
    private String mail;

    public SinhVien(String id, String ten, String lop, String mail) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.lop + " " + this.mail;
    }
}

public class LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            a.add(new SinhVien(id, ten, lop, mail));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(SinhVien i : a){
                String x = i.getLop();
                if(x.compareTo(s) == 0)
                    System.out.println(i);
            }
        }
    }
}
