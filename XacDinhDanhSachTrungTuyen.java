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
    private double m1;
    private double m2;
    private double m3;
    private String stt;

    public ThiSinh(String id, String name, double m1, double m2, double m3) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
    
    private double getBonusMark(){
        String cmp = this.id.substring(0, 3);
        if(cmp.equals("KV1"))
            return 0.5;
        else if(cmp.equals("KV2"))
            return 1;
        return 2.5;
    }
    
    public double getMark(){
        return this.m1*2 + this.m2 + this.m3 + this.getBonusMark();
    }
    
    @Override
    public int compareTo(ThiSinh b){
        if(this.getMark() != b.getMark())
            return -Double.compare(this.getMark(), b.getMark());
        return this.id.compareTo(b.id);
    }

    private String conv(double m){
        if(m == (int)m)
            return String.format("%d", (int)m);
        return String.format("%.1f", m);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.id, this.name,
        conv(this.getBonusMark()), conv(this.getMark()), this.stt);
    }
}

public class XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        int cnt = sc.nextInt();
        double cmpMark = a.get(cnt-1).getMark();
        System.out.println(String.format("%.1f", cmpMark));
        for(ThiSinh i : a){
            if(i.getMark() >= cmpMark)
                i.setStt("TRUNG TUYEN");
            else
                i.setStt("TRUOT");
            System.out.println(i);
        }
    }
}
