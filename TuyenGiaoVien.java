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
class GiaoVien implements Comparable<GiaoVien>{
    private String id;
    private String name;
    private String subject;
    private double p1;
    private double p2;

    public GiaoVien(int id, String name, String subject, double p1, double p2) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.subject = subject;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    private String getSubjectName(){
        char c = this.subject.charAt(0);
        if(c == 'A')
            return "TOAN";
        else if(c == 'B')
            return "LY";
        return "HOA";
    }
    
    private double getPriority(){
        int i = Integer.parseInt(this.subject.substring(1));
        if(i == 1)
            return 2;
        else if(i == 2)
            return 1.5;
        else if(i == 3)
            return 1;
        return 0;
    }
    
    private double getMark(){
        return this.p1*2 + this.p2 + this.getPriority();
    }
    
    private String getStatus(){
        if(this.getMark() >= 18)
            return "TRUNG TUYEN";
        return "LOAI";
    }
    
    @Override
    public int compareTo(GiaoVien b){
        return -Double.compare(this.getMark(), b.getMark());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %s", this.id, this.name,
                this.getSubjectName(), this.getMark(), this.getStatus());
    }
}

public class TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiaoVien> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            double p1 = sc.nextDouble();
            double p2 = sc.nextDouble();
            a.add(new GiaoVien(i, name, subject, p1, p2));
        }
        Collections.sort(a);
        for(GiaoVien i : a){
            System.out.println(i);
        }
    }
}