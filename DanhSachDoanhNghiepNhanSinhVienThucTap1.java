/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Administrator
 */
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma;
    private String ten;
    private int so;

    public DoanhNghiep(String ma, String ten, int so) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }
    
    @Override
    public int compareTo(DoanhNghiep b){
        if(this.so != b.so)
            return -Integer.compare(this.so, b.so);
        return this.ma.compareTo(b.ma);
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.so;
    }
}
public class DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int so = sc.nextInt();
            a.add(new DoanhNghiep(ma, ten, so));
        }
        Collections.sort(a);
        for(DoanhNghiep i : a){
            System.out.println(i);
        }
    }
}
