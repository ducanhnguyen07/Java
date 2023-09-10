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
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien(int id, String hoTen, String lop, String ngaySinh, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    
    public void ChuanHoa(){
        String s = "";
        StringTokenizer st = new StringTokenizer(this.hoTen.toLowerCase());
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            s += Character.toUpperCase(tmp.charAt(0));
            s += tmp.substring(1);
            s += " ";
        }
        this.hoTen = s.substring(0, s.length()-1);
    }
    
    public void conv(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/')
            sb.insert(0, "0");
        if(sb.charAt(4) == '/')
            sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh
            + " " + String.format("%.2f", this.gpa);
    }
}

public class DanhSachDoiTuongSinhVien3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.conv();
            x.ChuanHoa();
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                if(b.getGpa() > a.getGpa())
                    return 1;
                return -1;
            }
        });
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
