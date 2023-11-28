/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Administrator
 */
class Khach implements Comparable<Khach>{
    private String id;
    private String name;
    private String idRoom;
    private String d1;
    private String d2;

    public Khach(int id, String name, String idRoom, String d1, String d2) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.idRoom = idRoom;
        this.d1 = d1;
        this.d2 = d2;
    }
    
    private int getDay(){
        String s1 = this.d1;
        String s2 = this.d2;
        String[] date1 = s1.trim().split("/");
        String[] date2 = s2.trim().split("/");
        int nam1 = Integer.parseInt(date1[2]);
        int thang1 = Integer.parseInt(date1[1]);
        int ngay1 = Integer.parseInt(date1[0]);
        int nam2 = Integer.parseInt(date2[2]);
        int thang2 = Integer.parseInt(date2[1]);
        int ngay2 = Integer.parseInt(date2[0]);
        LocalDate day1 = LocalDate.of(nam1, thang1, ngay1);
        LocalDate day2 = LocalDate.of(nam2, thang2, ngay2);
        return (int)ChronoUnit.DAYS.between(day1, day2);
    }
    
    @Override
    public int compareTo(Khach b){
        return -Integer.compare(this.getDay(), b.getDay());
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.idRoom + " " + this.getDay();
    }
}

public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        ArrayList<Khach> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            String idRoom = sc.nextLine();
            String d1 = sc.nextLine();
            String d2 = sc.nextLine(); 
            a.add(new Khach(i, name, idRoom, d1, d2));
        }
        Collections.sort(a);
        for(Khach i : a){
            System.out.println(i);
        }
    }
}
