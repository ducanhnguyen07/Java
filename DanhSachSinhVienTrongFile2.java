/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class SinhVien{
    private String id;
    private String ten;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien(int id, String ten, String lop, String dob, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/')
            sb.insert(0, '0');
        if(sb.charAt(4) == '/')
            sb.insert(3, '0');
        this.dob = sb.toString();
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.lop + " " + this.dob + " " + 
                String.format("%.2f", this.gpa);
    }
}

public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            ArrayList<SinhVien> a = new ArrayList<>();
            for(int i=1; i<=n; i++){
                sc.nextLine();
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String dob = sc.nextLine();
                double gpa = sc.nextDouble();
                SinhVien s = new SinhVien(i, ten, lop, dob, gpa);
                s.chuanHoa();
                a.add(s);
            }
            for(SinhVien i : a){
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
