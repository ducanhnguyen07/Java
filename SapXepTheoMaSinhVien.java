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
class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String ten;
    private String lop;
    private String mail;

    public SinhVien(String id, String ten, String lop, String mail) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    
    @Override
    public int compareTo(SinhVien b){
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.lop + " " + this.mail;
    }
}

public class SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        while(sc.hasNext()){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            a.add(new SinhVien(id, ten, lop, mail));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
