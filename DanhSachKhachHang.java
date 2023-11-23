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
class KhachHang implements Comparable<KhachHang>{
    private String id;
    private String name;
    private String sex;
    private String dob;
    private String address;

    public KhachHang(int id, String name, String sex, String dob, String address) {
        this.id = "KH" + String.format("%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }
    
    public void convert(){
        String[] aName = this.name.trim().split("\\s+");
        String res = "";
        for(String i : aName){
            res += Character.toString(i.charAt(0)).toUpperCase()
                    + i.substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
        
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/')
            sb.insert(0, "0");
        if(sb.charAt(4) == '/')
            sb.insert(3, '0');
        this.dob = sb.toString();
    }
    
    private String getCmp(){
        return this.dob.substring(6) + this.dob.substring(3,5) 
                + this.dob.substring(0, 2);
    }
    
    @Override
    public int compareTo(KhachHang b){
        return this.getCmp().compareTo(b.getCmp());
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.sex + " " + this.address + " " + this.dob;
    }
}

public class DanhSachKhachHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> a  =new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            KhachHang x = new KhachHang(i, name, sex, dob, address);
            x.convert();
            a.add(x);
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
