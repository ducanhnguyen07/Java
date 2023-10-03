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
class GameThu implements Comparable<GameThu>{
    private String id;
    private String hoTen;
    private String gioBatDau;
    private String gioKetThuc;

    public GameThu(String id, String hoTen, String gioBatDau, String gioKetThuc) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }
    
    public int getThoiGianThuc(){
        String st = this.gioBatDau;
        String fi = this.gioKetThuc;
        int gio = Integer.valueOf(fi.substring(0, 2)) - 
                Integer.valueOf(st.substring(0, 2));
        int phut = Integer.valueOf(fi.substring(3)) - 
                Integer.valueOf(st.substring(3));
        return gio*60 + phut;
    }
    
    public String getThoiGian(){
        String st = this.gioBatDau;
        String fi = this.gioKetThuc;
        int gio = Integer.valueOf(fi.substring(0, 2)) - 
                Integer.valueOf(st.substring(0, 2));
        int phut = Integer.valueOf(fi.substring(3)) - 
                Integer.valueOf(st.substring(3));
        if(phut < 0) {
            phut += 60;
            gio--;
        }
        return String.format("%d", gio) + " gio " + 
                String.format("%d", phut) + " phut";
    }
    
    @Override
    public int compareTo(GameThu b){
        return -(Integer.compare(this.getThoiGianThuc(), b.getThoiGianThuc()));
    }

    @Override
    public String toString() {
        return this.id + " " + this.hoTen + " " + this.getThoiGian();
    }
}
public class TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioBatDau = sc.nextLine();
            String gioKetThuc = sc.nextLine();
            a.add(new GameThu(id, hoTen, gioBatDau, gioKetThuc));
        }
        Collections.sort(a);
        for(GameThu i : a){
            System.out.println(i);
        }
    }
}
