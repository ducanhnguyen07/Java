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
public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public long ucln(){
        long a = this.tuSo;
        long b = this.mauSo;
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.tuSo/ucln() + "/" + this.mauSo/ucln();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        PhanSo ps = new PhanSo(tuSo, mauSo);
        System.out.println(ps);
    }
}
