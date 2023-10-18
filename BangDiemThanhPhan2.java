/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author Administrator
 */
class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String ten;
    private String lop;
    private double a, b, c;

    public SinhVien(String id, String ten, String lop, double a, double b, double c) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int compareTo(SinhVien b){
        return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", 
        this.id, this.ten, this.lop, this.a, this.b, this.c);
    }
}
public class BangDiemThanhPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            l.add(new SinhVien(id, ten, lop, a, b, c));
        }
        Collections.sort(l);
        for(int i=0; i<n; i++){
            System.out.println(String.format("%d ", i+1) + l.get(i));
        }
    }
}
