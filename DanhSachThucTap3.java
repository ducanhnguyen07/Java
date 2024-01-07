/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien;

import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
class SinhVien implements Comparable<SinhVien>{
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

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }
    
    public void conv(){
        String[] s = this.ten.trim().split("\\s+");
        String n = "";
        for(String i : s){
            n += Character.toString(i.charAt(0)).toUpperCase() +
                    i.substring(1).toLowerCase() + " ";
        }
        this.ten = n.trim();
    }
        
    @Override
    public int compareTo(SinhVien b){
        return this.id.compareTo(b.id);
    }
}

class DoanhNghiep{
    private String ma;
    private String ten;
    private int soSV;

    public DoanhNghiep(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
}

class ThucTap implements Comparable<ThucTap>{
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }

    public SinhVien getSv() {
        return sv;
    }

    public DoanhNghiep getDn() {
        return dn;
    }
    
    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setDn(DoanhNghiep dn) {
        this.dn = dn;
    }
    
    @Override
    public int compareTo(ThucTap b){
        return this.sv.getId().compareTo(b.sv.getId());
    }
    
    @Override
    public String toString() {
        return this.sv.getId() + " " + this.sv.getTen() + " " + this.sv.getLop();
    }
}

public class DanhSachThucTap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        
        int n = sc1.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<>();
        sc1.nextLine();
        for(int i=0; i<n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            x.conv();
            sv.add(x);
        }
        Collections.sort(sv);
        
        int m = sc2.nextInt();
        ArrayList<DoanhNghiep> dn = new ArrayList<>();
        for(int i=0; i<m; i++){
            sc2.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), sc2.nextInt());
            dn.add(x);
        }

        int k = sc3.nextInt();
        ArrayList<ThucTap> tt = new ArrayList<>();
        sc3.nextLine();
        for(int i=0; i<k; i++){
            ThucTap x = new ThucTap(null, null);
            String[] s = sc3.nextLine().trim().split("\\s+");
            for(DoanhNghiep j : dn){
                if(j.getMa().equals(s[1]) && j.getSoSV() > 0){
                    x.setDn(j);
                    break;
                }
            }
            for(SinhVien j : sv){
                if(j.getId().equals(s[0])){
                    x.setSv(j);
                    break;
                }
            }
            tt.add(x);
        }
        Collections.sort(tt);
        
        int t = sc3.nextInt();
        sc3.nextLine();
        while(t-- > 0){
            String cmp = sc3.nextLine().trim();
            DoanhNghiep x = null;
            for(DoanhNghiep i : dn){
                if(i.getMa().equals(cmp)){
                    x = i;
                    System.out.println("DANH SACH THUC TAP TAI " + i.getTen() + ":");
                    break;
                }
            }
            int cnt = 0;
            for(ThucTap i : tt){
                if(i.getDn().getMa().equals(cmp) && cnt < x.getSoSV()){
                    System.out.println(i);
                    cnt++;
                }
            }
        }
    }
}
