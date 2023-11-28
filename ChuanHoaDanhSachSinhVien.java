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
    private String name;
    private String className;
    private String dob;
    private double gpa;

    public SinhVien(int id, String name, String className, String dob, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void conv(){
        String[] s = this.name.trim().split("\\s+");
        String cname = "";
        for(String i : s){
            cname +=  Character.toString(i.charAt(0)).toUpperCase()
                    + i.substring(1).toLowerCase() + " ";
        }
        this.name = cname.trim();
        
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/')
            sb.insert(0, "0");
        if(sb.charAt(4) == '/')
            sb.insert(3, "0");
        this.dob = sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", this.id, this.name,
                this.className, this.dob, this.gpa);
    }
}

public class ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien x = new SinhVien(i, name, className, dob, gpa);
            x.conv();
            a.add(x);
        }
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
