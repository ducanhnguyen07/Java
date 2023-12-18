/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newnhanvien1;

import java.time.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
class Tinh{
    protected String maVung;
    protected String ten;
    protected long gia;

    public Tinh(String maVung, String ten, long gia) {
        this.maVung = maVung;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }    
}

class CuocGoi extends Tinh{
    private String thueBao;
    private String st;
    private String fi;
    private int cmp;

    public CuocGoi(String thueBao, String st, String fi, String maVung, String ten, long gia) {
        super(maVung, ten, gia);
        this.thueBao = thueBao;
        this.st = st;
        this.fi = fi;
        if(thueBao.contains("-"))
            this.cmp = Integer.parseInt(thueBao.substring(0, 3));
        else
            this.cmp = Integer.parseInt(thueBao);
    }

    public int getCmp() {
        return cmp;
    }

    public String getThueBao() {
        return thueBao;
    }

    private long getThoiGian(){
        LocalTime t1 = LocalTime.parse(this.st);
        LocalTime t2 = LocalTime.parse(this.fi);
        long t = t1.until(t2, java.time.temporal.ChronoUnit.MINUTES);
        if(this.thueBao.charAt(0) == '0')
            return (long)t;
        return (long)(Math.ceil(t / 3.0));
    }
    
    private long getPhi(){
        return this.getThoiGian() * this.getGia();
    }

    @Override
    public String toString() {
        return this.thueBao + " " + this.ten + " " + 
                this.getThoiGian() + " " + this.getPhi();
    }
}

public class TinhCuocDienThoaiCoDinh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Tinh> aT = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            aT.add(new Tinh(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        int m = sc.nextInt();
        ArrayList<CuocGoi> aP = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<m; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            CuocGoi x = new CuocGoi(s[0], s[1], s[2], "", "", 0);
            if(x.getThueBao().contains("-")){
                for(Tinh j : aT){
                    if(Integer.parseInt(j.getMaVung()) == x.getCmp()){
                        x.setTen(j.getTen());
                        x.setGia(j.getGia());
                        x.setMaVung(j.getMaVung());
                        break;
                    } 
                }
            }
            else{
                x.setTen("Noi mang");
                x.setGia(800);
            }
            aP.add(x);
        }
        for(CuocGoi i : aP){
            System.out.println(i);
        }
    }     
}
