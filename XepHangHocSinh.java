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
class HocSinh{
    private String id;
    private String ten;
    private double diem;
    private int xepHang;

    public HocSinh(int id, String ten, double diem) {
        this.id = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.diem = diem;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public double getDiem() {
        return diem;
    }

    public String getId() {
        return id;
    }
    
    public String getXepLoai(){
        if(this.diem < 5)
            return "Yeu";
        else if(this.diem < 7)
            return "Trung Binh";
        else if(this.diem < 9)
            return "Kha";
        return "Gioi";
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s %d", this.id, this.ten,
                this.diem,this.getXepLoai(), this.xepHang);
    }
}

public class XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double diem = sc.nextDouble();
            a.add(new HocSinh(i, ten, diem));
        }
        Collections.sort(a, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh x, HocSinh y){
                return -Double.compare(x.getDiem(), y.getDiem());
            }
        });
        int cur_rank = 1;
        int cnt = 0;
        double cur_mark = 0.f;
        for(HocSinh i : a){
            if(i.getDiem() < cur_mark){
                i.setXepHang(cur_rank + cnt + 1);
                cur_mark = i.getDiem();
                cur_rank += cnt + 1;
                cnt = 0;
            }
            else if(i.getDiem() == cur_mark){
                i.setXepHang(cur_rank);
                cnt++;
            }
            else{
                cur_mark = i.getDiem();
                i.setXepHang(cur_rank);
            }
        }
        Collections.sort(a, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh x, HocSinh y){
                return x.getId().compareTo(y.getId());
            }
        });
        for(HocSinh i : a){
            System.out.println(i);
        }
    }
}