/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author Administrator
 */
class MatHang implements Comparable<MatHang>{
    private String id;
    private String ten;
    private String dvt;
    private double nhap;
    private double sl;

    public MatHang(int id, String ten, String dvt, double nhap, double sl) {
        this.id = "MH" + String.format("%02d", id);
        this.ten = ten;
        this.dvt = dvt;
        this.nhap = nhap;
        this.sl = sl;
    }
    
    public double getPhiVanChuyen(){
        return this.nhap * this.sl * 0.05;
    }
    
    public double getThanhTien(){
        return this.nhap * this.sl + this.getPhiVanChuyen();
    }
    
    public double getGiaBan(){
        return this.getThanhTien() * 1.02 / this.sl;
    }
    
    @Override
    public int compareTo(MatHang b){
        return -Double.compare(this.getGiaBan(), b.getGiaBan());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %d", 
            this.id, this.ten, this.dvt, 
            this.getPhiVanChuyen(), this.getThanhTien(), (int)Math.ceil(this.getGiaBan()/100) * 100);
    }
}
public class TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String dvt = sc.nextLine();
            double nhap = sc.nextDouble();
            double sl = sc.nextDouble();
            a.add(new MatHang(i+1, ten, dvt, nhap, sl));
        }
        Collections.sort(a);
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
