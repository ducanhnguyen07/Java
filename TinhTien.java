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
class HoaDon implements Comparable<HoaDon>{
    private String id;
    private String name;
    private long quantity;
    private long cost;
    private long discount;

    public HoaDon(String id, String name, long quantity, long cost, long discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
    }
    
    public long getMoney(){
        return this.quantity * this.cost - this.discount;
    }
    
    @Override
    public int compareTo(HoaDon b){
        return -Long.compare(this.getMoney(), b.getMoney());
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.quantity + " " + this.cost
                + " " + this.discount + " " + this.getMoney();
    }
}

public class TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HoaDon> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            long quantity = sc.nextLong();
            long cost = sc.nextLong();
            long discount = sc.nextLong(); 
            a.add(new HoaDon(id, name, quantity, cost, discount));
        }
        Collections.sort(a);
        for(HoaDon i : a){
            System.out.println(i);
        }
    }
}
