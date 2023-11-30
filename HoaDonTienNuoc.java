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
class KhachHang implements Comparable<KhachHang>{
    private String id;
    private String name;
    private double oldIdx;
    private double newIdx;

    public KhachHang(int id, String name, double oldIdx, double newIdx) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.oldIdx = oldIdx;
        this.newIdx = newIdx;
    }

    private double getCost(){
        double cost = this.newIdx - this.oldIdx;
        if(cost <= 50)
            return cost * 100 * 1.02;
        else if(cost <= 100)
            return (5000 + (cost - 50) * 150) * 1.03;
        return (5000 + 7500 + (cost - 100) * 200) * 1.05;
    }
    
    @Override
    public int compareTo(KhachHang b){
        return -Double.compare(this.getCost(), b.getCost());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f", this.id, this.name, this.getCost());
    }
}

public class HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double oi = sc.nextDouble();
            double ni = sc.nextDouble();
            a.add(new KhachHang(i, name, oi, ni));
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
