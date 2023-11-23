/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
/**
 *
 * @author Administrator
 */
class HocPhan implements Comparable<HocPhan>{
    private String id;
    private String ten;
    private String nhom;
    private String tenGV;

    public HocPhan(String id, String ten, String nhom, String tenGV) {
        this.id = id;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }
        
    @Override 
    public int compareTo(HocPhan b){
        if(!this.id.equals(b.id))
            return this.id.compareTo(b.id);
        return this.nhom.compareTo(b.nhom);
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.nhom;
    }
}

public class LopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocPhan> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String tenGV = sc.nextLine();
            a.add(new HocPhan(id.trim(), ten.trim(), nhom.trim(), tenGV.trim()));
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<m; i++){
            String cmp = sc.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n",  cmp);
            for(HocPhan j : a){
                if(j.getTenGV().equals(cmp)){
                    System.out.println(j);
                }
            }
        }
    }
}
