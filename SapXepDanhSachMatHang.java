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
class MatHang implements Comparable<MatHang>{
    private int id;
    private String name;
    private String type;
    private double sell;
    private double buy;

    public MatHang(int id, String name, String type, double sell, double buy) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.sell = sell;
        this.buy = buy;
    }
    
    public double getMoney(){
        return this.buy - this.sell;
    }
    
    @Override
    public int compareTo(MatHang b){
        if(this.getMoney() != b.getMoney())
            return -Double.compare(this.getMoney(), b.getMoney());
        return Integer.compare(this.id, b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.type + " " + 
            String.format("%.2f", this.getMoney());
    }
}

public class SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            double sell = sc.nextDouble();
            double buy = sc.nextDouble();
            a.add(new MatHang(i, name, type, sell, buy));
        }
        Collections.sort(a);
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
