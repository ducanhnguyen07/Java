/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien1;

import java.util.*;
/**
 *
 * @author Administrator
 */
class NhanVien implements Comparable<NhanVien>{
    private String id;
    private String name;
    private String chucVu;

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    private String getSoHieu(){
        return this.id.substring(4);
    }
    
    private String getHeSoLuong(){
        return this.id.substring(2, 4);
    }
    
    @Override
    public int compareTo(NhanVien b){
        if(!this.getHeSoLuong().equals(b.getHeSoLuong()))
            return -this.getHeSoLuong().compareTo(b.getHeSoLuong());
        return this.getSoHieu().compareTo(b.getSoHieu());
    }

    @Override
    public String toString() {
        return this.name + " " + this.getChucVu() + " " + this.getSoHieu() + " " + this.getHeSoLuong();
    }
}

public class LietKeNhanVienTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        sc.nextLine();
        int cntGD = 0;
        int cntPP = 0;
        int cntTP = 0;
        for(int i=0; i<n; i++){
            String[] s = sc.nextLine().split("\\s+");
            String id = s[0];
            String name = "";
            for(int j=1; j<s.length; j++){
                name += s[j] + " ";
            }
            NhanVien x = new NhanVien(s[0], name.trim());
            x.setChucVu(id.substring(0, 2));
            a.add(x);
        }
        for(NhanVien i : a){
            if(i.getChucVu().equals("GD")){
                if(cntGD < 1)
                    cntGD++;
                else
                    i.setChucVu("NV");
            }
            if(i.getChucVu().equals("TP")){
                if(cntTP < 3)
                    cntTP++;
                else
                    i.setChucVu("NV");
            }
            if(i.getChucVu().equals("PP")){
                if(cntPP < 3)
                    cntPP++;
                else
                    i.setChucVu("NV");
            }
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<m; i++){
            String cmp = sc.nextLine();
            for(NhanVien j : a){
                if(j.getChucVu().equals(cmp))
                    System.out.println(j);
            }
            System.out.println();
        }
    }
}
