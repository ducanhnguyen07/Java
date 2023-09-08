/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
/**
 *
 * @author Administrator
 */

import java.io.*;
import java.util.*;
import java.math.*;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }     
}

public class KhaiBaoLopPoint {    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                double x1 =sc.nextDouble();
                double y1 =sc.nextDouble();
                double x2 =sc.nextDouble();
                double y2 =sc.nextDouble();
                Point a = new Point(x1, y1);
                Point b = new Point(x2, y2);
                double res = (a.getX() - b.getX())*(a.getX() - b.getX())
                        + (a.getY() - b.getY())*(a.getY() - b.getY());
                System.out.printf("%.4f\n", Math.sqrt(res));
            }
        }
}