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
class TamGiac{
    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

public class DienTichHinhTronNgoaiTiepTamGiac {
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
            if(a+b <= c || b+c <= a || c+a <= b){
                System.out.println("INVALID");
            }
            else{
                double p = (x.getA()+x.getB()+x.getC())/2.0;
                double S = Math.sqrt(p * (p-x.getA()) * (p-x.getB()) * (p-x.getC()));
                double r = 0.25*x.getA()*x.getB()*x.getC()/S;
                double s = Math.PI*r*r;
                System.out.printf("%.3f\n", s);
            }
        }
    }
}
