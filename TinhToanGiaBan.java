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
class DonHang{
    private String id;
    private double cost;
    private double quantity;

    public DonHang(String id, double cost, double quantity) {
        this.id = id;
        this.cost = cost;
        this.quantity = quantity;
    }
    
    private double getMoney(){
        double tax = 0;
        double ship = 0;
        double total = this.cost * this.quantity;
        if(this.id.charAt(0) == 'T'){
            tax = total * 0.29;
            ship = total * 0.04;
        }
        else if(this.id.charAt(0) == 'C'){
            tax = total * 0.1;
            ship = total * 0.03;
        }
        else if(this.id.charAt(0) == 'D'){
            tax = total * 0.08;
            ship = total * 0.025;
        }
        else{
            tax = total * 0.02;
            ship = total * 0.005;
        }
        if(this.id.charAt(this.id.length()-1) == 'C')
            tax *= 0.95;
        return (total + tax + ship) * 1.2 / this.quantity;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", this.id, this.getMoney());
    }
}

public class TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            a.add(new DonHang(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2])));
        }
        for(DonHang i : a){
            System.out.println(i);
        }
    }
}
