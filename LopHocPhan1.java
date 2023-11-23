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

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }
        
    @Override 
    public int compareTo(HocPhan b){
        return this.nhom.compareTo(b.nhom);
    }

    @Override
    public String toString() {
        return this.nhom + " " + this.tenGV;
    }
}

public class LopHocPhan1 {
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
            a.add(new HocPhan(id, ten, nhom, tenGV));
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<m; i++){
            String cmp = sc.nextLine();
            System.out.print("Danh sach nhom lop mon ");
            
            for(HocPhan j : a){
                if(j.getId().equals(cmp)){
                    System.out.println(j.getTen() + ":");
                    break;
                }
            }
            for(HocPhan j : a){
                if(j.getId().equals(cmp)){
                    System.out.println(j);
                }
            }
        }
    }
}
