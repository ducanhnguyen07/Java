/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class MatHang implements Comparable<MatHang>{
    private String id;
    private String ten;
    private String nhom;
    private double mua;
    private double ban;

    public MatHang(int id, String ten, String nhom, double mua, double ban) {
        this.id = "MH" + String.format("%02d", id);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    
    private double getLN(){
        return this.ban - this.mua;
    }
    
    @Override
    public int compareTo(MatHang b){
        return -Double.compare(this.getLN(), b.getLN());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", this.id, this.ten,
                            this.nhom, this.getLN());
    }    
}

public class SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            a.add(new MatHang(i, ten, nhom, mua, ban));
        }
        Collections.sort(a);
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
