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
class SP implements Comparable<SP>{
    private String id;
    private String ten;
    private int gia;
    private int han;

    public SP(String id, String ten, int gia, int han) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.han = han;
    }
    
    @Override
    public int compareTo(SP b){
        if(this.gia != b.gia)
            return -Integer.compare(this.gia, b.gia);
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.gia + " " + this.han;
    }
}

public class DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        ArrayList<SP> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            int han = sc.nextInt();
            a.add(new SP(id, ten, gia, han));
        }
        Collections.sort(a);
        for(SP i : a){
            System.out.println(i);
        }
    }
}
