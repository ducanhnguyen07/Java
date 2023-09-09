/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

/**
 *
 * @author Administrator
 */

class Rectangle{
    private double l;
    private double r;
    private String color;

    public Rectangle(double l, double r, String color) {
        this.l = l;
        this.r = r;
        this.color = color;
    }

    
    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int findArea(){
        return (int)(this.l * this.r);
    }
    
    public int findPerimeter(){
        return (int)(this.l + this.r)*2;
    }
    
    public void conv(){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(this.color.charAt(0)));
        for(int i=1; i<this.color.length(); i++){
            sb.append(Character.toLowerCase(this.color.charAt(i)));
        }
        this.color = sb.toString();
    }

    @Override
    public String toString() {
        return findPerimeter() + " " + findArea() + " " + this.color;
    }
}

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double r = sc.nextDouble();
        String color = sc.next();
        Rectangle rec = new Rectangle(l, r, color);
        rec.conv();
        if(l <= 0 || r <= 0)
            System.out.println("INVALID");
        else
            System.out.println(rec);
    }
}
