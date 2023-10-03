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
class ThiSinh implements Comparable<ThiSinh> {
    private int id;
    private String ten;
    private String ngaySinh;
    private double diem1;
    private double diem2;
    private double diem3;

    public ThiSinh(int id, String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public double getTongDiem(){
        return diem1 + diem2 + diem3;
    }
    
    @Override
    public int compareTo(ThiSinh b){
        if(this.getTongDiem() != b.getTongDiem()) 
            return -Double.compare(this.getTongDiem(), b.getTongDiem());
        return Integer.compare(this.id, b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.ngaySinh + " " + 
            String.format("%.1f", this.getTongDiem());
    }
}

public class TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();;
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            a.add(new ThiSinh(i, ten, ngaySinh, diem1, diem2, diem3));
        }
        Collections.sort(a);
        double maxx = a.get(0).getTongDiem();
        for(ThiSinh i : a){
            if(i.getTongDiem() == maxx){
                System.out.println(i);
            }
            else
                break;
        }
    }
}
