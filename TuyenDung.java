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
class ThiSinh implements Comparable<ThiSinh>{
    private String id;
    private String name;
    private double p1;
    private double p2;

    public ThiSinh(int id, String name, double p1, double p2) {
        this.id = "TS" + String.format("%02d", id);
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    private double getMark(){
        if(this.p1 > 10) 
            this.p1 /= 10;
        if(this.p2 > 10) 
            this.p2 /= 10;
        return (this.p1 + this.p2) / 2.0;
    }
    
    private String getStatus(){
        if(this.getMark() < 5)
            return "TRUOT";
        else if(this.getMark() < 8)
            return "CAN NHAC";
        else if(this.getMark() < 9.5)
            return "DAT";
        return "XUAT SAC";
    }

    @Override
    public int compareTo(ThiSinh b){
        return -Double.compare(this.getMark(), b.getMark());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", this.id, this.name,
                             this.getMark(), this.getStatus());
    }
}

public class TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double p1 = sc.nextDouble();
            double p2 = sc.nextDouble();
            a.add(new ThiSinh(i, name, p1, p2));
        }
        Collections.sort(a);
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }
}
