/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
class TamGiac{
    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getChuVi(){
        return this.a + this.b + this.c;
    }
}

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double xa = sc.nextDouble();
            double ya = sc.nextDouble();
            double xb = sc.nextDouble();
            double yb = sc.nextDouble();
            double xc = sc.nextDouble();
            double yc = sc.nextDouble();
            double a = Math.sqrt((xa-xb)*(xa-xb) + (ya-yb)*(ya-yb));
            double b = Math.sqrt((xb-xc)*(xb-xc) + (yb-yc)*(yb-yc));
            double c = Math.sqrt((xa-xc)*(xa-xc) + (ya-yc)*(ya-yc));
            TamGiac x = new TamGiac(a, b, c);
            if(a+b <= c || b+c <= a || c+a <= b)
                System.out.println("INVALID");
            else{
                System.out.printf("%.3f\n", x.getChuVi());
            }
            //System.out.println(x);
        }
    }
}
