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
class SinhVien{
    private String id;
    private String ten;
    private String lop;
    private String sta;

    public SinhVien(String id, String ten, String lop, String sta) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.sta = sta;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }
    
    public void setSta(String sta) {
        this.sta = sta;
    }
    
    public int getDiem(){
        int d = 10;
        for(int i=0; i<this.sta.length(); i++){
            if(this.sta.charAt(i) == 'v'){
                d -= 2;
            }
            else if(this.sta.charAt(i) == 'm'){
                d -= 1;
            }
        }
        if(d < 0) 
            return 0;
        return d;
    }
    
    public String getStatus(){
        if(this.getDiem() == 0)
            return " KDDK";
        return "";
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.lop + " " + this.getDiem() + this.getStatus();
    }
}

public class DiemDanh2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            a.add(new SinhVien(id, ten, lop, ""));
        }
        for(int i=0; i<n; i++){
            String[] s = sc.nextLine().split("\\s+");
            for(int j=0; j<n; j++){
                if(a.get(j).getId().equalsIgnoreCase(s[0])){
                    a.get(j).setSta(s[1]);
                    break;
                }
            }
        }
        String cmp = sc.nextLine();
        for(SinhVien i : a){
            if(i.getLop().equalsIgnoreCase(cmp))
                System.out.println(i);
        }
    }
}
