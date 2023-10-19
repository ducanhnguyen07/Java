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
    private String ten;
    private int soBaiDung, soLanSub;

    public SinhVien(String ten, int soBaiDung, int soLanSub) {
        this.ten = ten;
        this.soBaiDung = soBaiDung;
        this.soLanSub = soLanSub;
    }
    
    @Override
    public int compareTo(SinhVien b){
        if(this.soBaiDung != b.soBaiDung)
            return -Integer.compare(this.soBaiDung, b.soBaiDung);
        else if(this.soLanSub != b.soLanSub)
            return Integer.compare(this.soLanSub, b.soLanSub);
        return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
        return this.ten + " " + this.soBaiDung + " " + this.soLanSub;
    }
}

public class BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            int soBaiDung = sc.nextInt();
            int soLanSub = sc.nextInt();
            a.add(new SinhVien(ten, soBaiDung, soLanSub));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
