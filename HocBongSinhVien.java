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
class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private double gpa;
    private double diemRL;
    private String stt;

    public SinhVien(String ten, double gpa, double diemRL) {
        this.ten = ten;
        this.gpa = gpa;
        this.diemRL = diemRL;
    }

    public String getTen() {
        return ten;
    }

    public double getGpa() {
        return gpa;
    }

    public double getDiemRL() {
        return diemRL;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    @Override
    public int compareTo(SinhVien b){
        if(this.gpa != b.gpa)
            return -Double.compare(this.gpa, b.gpa);
        return -Double.compare(this.diemRL, b.diemRL);
    }

    @Override
    public String toString() {
        return this.ten + ": " + this.stt;
    }
}

public class HocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            a.add(new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }

        ArrayList<SinhVien> b = new ArrayList<>(a);
        Collections.sort(b);
        double cmp = b.get(m-1).getGpa();
        for(SinhVien i : b){
            if(i.getGpa() >= 3.6 && i.getDiemRL() >= 90)
                i.setStt("XUATSAC");
            else if(i.getGpa() >= 3.2 && i.getDiemRL() >= 80)
                i.setStt("GIOI");
            else if(i.getGpa() >= 2.5 && i.getDiemRL() >= 70)
                i.setStt("KHA");
            else
                i.setStt("KHONG");
        }
        for(int i=m; i<b.size(); i++){
            if(b.get(i).getGpa() < cmp)
                b.get(i).setStt("KHONG");
        }
        for(SinhVien i : a){
            for(SinhVien j : b){
                if(i.getTen().equals(j.getTen()) && i.getGpa() == j.getGpa() && i.getDiemRL() == j.getDiemRL()){
                    i.setStt(j.getStt());
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
