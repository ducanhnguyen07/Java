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
    private int stt;
    private String id;
    private String ten;
    private String lop;
    private String  mail;
    private String dn;

    public SinhVien(int stt, String id, String ten, String lop, String mail, String dn) {
        this.stt = stt;
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }
    
    @Override
    public int compareTo(SinhVien b){
        return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
        return this.stt + " " + this.id + " " + this.ten + " " + this.lop + " " +
                this.mail + " " + this.dn;
    }
}

public class DanhSachThucTap1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            String dn = sc.nextLine();
            a.add(new SinhVien(i+1, id, ten, lop, mail, dn));
        }
        Collections.sort(a);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String DN = sc.nextLine();
            for(SinhVien i : a){
                if(i.getDn().compareTo(DN) == 0)
                    System.out.println(i);
            }
        }
    }
}
