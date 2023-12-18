/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien1;

import java.util.*;
/**
 *
 * @author Administrator
 */
class Phong{
    protected String idPhong;
    protected String tenPhong;

    public Phong(String idPhong, String tenPhong) {
        this.idPhong = idPhong;
        this.tenPhong = tenPhong;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
}

class NhanVien extends Phong{
    private String id;
    private String ten;
    private double luongCB;
    private double ngay;

    public NhanVien(String id, String ten, double luongCB, double ngay, String idPhong, String tenPhong) {
        super(idPhong, tenPhong);
        this.id = id;
        this.ten = ten;
        this.luongCB = luongCB;
        this.ngay = ngay;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getId() {
        return id;
    }
    
    private double getLuong(){
        double luong = this.luongCB * this.ngay;
        double[][] a = {{10, 12, 14, 20},
                        {10, 11, 13, 16},
                        {9, 10, 12, 14},
                        {8, 9, 11, 13}};
        int idx = Character.valueOf(this.id.charAt(0)) - Character.valueOf('A');
        int nam = Integer.parseInt(this.id.substring(1, 3));
        if(nam <= 3)
            luong *= a[idx][0];
        else if(nam <= 8)
            luong *= a[idx][1];
        else if(nam <= 15)
            luong *= a[idx][2];
        else 
            luong *= a[idx][3];
        return luong * 1000;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f", this.id, this.ten, 
                            this.tenPhong, this.getLuong());
    }
}

public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Phong> aP = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            aP.add(new Phong(sc.next(), sc.nextLine().trim()));
        }
        
        int m = sc.nextInt();
        ArrayList<NhanVien> aN = new ArrayList<>();
        for(int i=0; i<m; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), "", "");
            for(Phong j : aP){
                if(x.getId().substring(3).equals(j.getIdPhong())){
                    x.setIdPhong(j.getIdPhong());
                    x.setTenPhong(j.getTenPhong());
                    break;
                }
            }
            aN.add(x);
        }
        for(NhanVien i : aN){
            System.out.println(i);
        }
    }
}
