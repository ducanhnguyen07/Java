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
class CLB{
    private String id;
    private String ten;
    private int cost;

    public CLB(String id, String ten, int cost) {
        this.id = id;
        this.ten = ten;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }
    
    public int getCost() {
        return cost;
    }
}

class TranDau implements Comparable<TranDau>{
    private String id;
    private int soLuong;
    private int tong;
    private String tenDoi;

    public TranDau(String id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }    

    public String getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public void setTenDoi(String tenDoi) {
        this.tenDoi = tenDoi;
    }
    
    @Override
    public int compareTo(TranDau b){
        if(this.tong != b.tong){
            return -Integer.compare(this.tong, b.tong);
        }
        return this.tenDoi.compareTo(b.tenDoi);
    }

    @Override
    public String toString() {
        return this.id + " " + this.tenDoi + " " + this.tong;
    }
}

public class CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<CLB> aCLB = new ArrayList<>();
        ArrayList<TranDau> aTranDau = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String ten = sc.nextLine();
            int cost = sc.nextInt();
            aCLB.add(new CLB(id, ten, cost));
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            sc.nextLine();
            String id = sc.next();
            int soLuong = sc.nextInt();
            aTranDau.add(new TranDau(id, soLuong));
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(aTranDau.get(i).getId().substring(1, 3).equalsIgnoreCase(aCLB.get(j).getId())){
                    aTranDau.get(i).setTenDoi(aCLB.get(j).getTen());
                    aTranDau.get(i).setTong(
                       aTranDau.get(i).getSoLuong() * aCLB.get(j).getCost()
                    );
                    break;
                }
            }
        }
        Collections.sort(aTranDau);
        for(TranDau i : aTranDau){
            System.out.println(i);
        }
    }
}
