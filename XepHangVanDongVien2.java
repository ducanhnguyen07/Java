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
class Vdv{
    private String id;
    private String ten;
    private String ngaySinh;
    private String start;
    private String finish;
    private int rank;

    public Vdv(int id, String ten, String ngaySinh, String start, String finish) {
        this.id = "VDV" + String.format("%02d", id);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.start = start;
        this.finish = finish;
    }

    public String getId() {
        return id;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getUuTien(){
        int tuoi = 2021 - Integer.parseInt(this.ngaySinh.substring(this.ngaySinh.lastIndexOf("/")+1));
        if(tuoi >= 32)
            return 3;
        else if(tuoi >= 25)
            return 2;
        else if(tuoi >= 18)
            return 1;
        return 0;
    }
    
    public int getThoiGianThuc(){
        int st = Integer.parseInt(this.start.substring(0, 2)) * 3600
                + Integer.parseInt(this.start.substring(3, 5)) * 60
                + Integer.parseInt(this.start.substring(6));
        int fi = Integer.parseInt(this.finish.substring(0, 2)) * 3600
                + Integer.parseInt(this.finish.substring(3, 5)) * 60
                + Integer.parseInt(this.finish.substring(6));
        return fi - st;
    }
    
    public int getThoiGian(){
        return this.getThoiGianThuc() - this.getUuTien();
    }
    
    public String convert(int time){
        int h = time / 3600;
        int m = (time - h*3600) / 60;
        int s = time - h*3600 - m*60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", this.id, this.ten,
                convert(this.getThoiGianThuc()), 
                convert(this.getUuTien()),
                convert(this.getThoiGian()),
                this.rank
        );
    }
} 

public class XepHangVanDongVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Vdv> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            a.add(new Vdv(i, ten, ngaySinh, start, finish));
        }
        Collections.sort(a, new Comparator<Vdv>(){
            @Override
            public int compare(Vdv a, Vdv b){
                return Integer.compare(a.getThoiGian(), b.getThoiGian());
            }
        });
        int cur_rank = 0;
        int cur_time = 0;
        int cnt = 0;
        for(Vdv i : a){
            if(i.getThoiGian() == cur_time){
                i.setRank(cur_rank);
                cnt++;
            }
            else {
                i.setRank(cur_rank + cnt + 1);
                cur_rank += cnt + 1;
                cnt = 0;
                cur_time = i.getThoiGian();
            }
        }
        for(Vdv i : a){
            System.out.println(i);
        }
    }
}
