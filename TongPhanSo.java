/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
class PhanSo{
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public void RutGon(){
        long a = this.tuSo;
        long b = this.mauSo;
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        this.tuSo = this.tuSo/a;
        this.mauSo = this.mauSo/a;
    }
    
    public PhanSo CongPhanSo(PhanSo b){
        long tuSo = this.tuSo * b.mauSo + this.mauSo * b.tuSo;
        long mauSo = this.mauSo * b.mauSo;
        PhanSo res = new PhanSo(tuSo, mauSo);
        return res;
    }

    @Override
    public String toString() {
        return this.tuSo + "/" + this.mauSo;
    }
}



public class TongPhanSo {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long at = sc.nextLong();
        long am = sc.nextLong();
        long bt = sc.nextLong();
        long bm = sc.nextLong();
        PhanSo a = new PhanSo(at, am);
        PhanSo b = new PhanSo(bt, bm);
        a.RutGon();
        b.RutGon();
        PhanSo res = a.CongPhanSo(b);
        res.RutGon();
        System.out.println(res);
    }
}
