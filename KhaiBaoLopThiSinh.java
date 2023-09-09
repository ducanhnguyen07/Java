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
class ThiSinh{
    private String name;
    private String date;
    private double d1;
    private double d2;
    private double d3;

    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public double TongDiem(){
        return this.d1 + this.d2 + this.d3;
    }

    @Override
    public String toString() {
        return this.name + " " + this.date + " " + String.format("%.1f", TongDiem());
    }   
}

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        ThiSinh a = new ThiSinh(name, date, d1, d2, d3);
        System.out.println(a);
    }
}
