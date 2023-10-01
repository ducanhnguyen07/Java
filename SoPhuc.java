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
class ComplexNum{
    private int real;
    private int virt;

    public ComplexNum(int real, int virt) {
        this.real = real;
        this.virt = virt;
    }
    
    public ComplexNum addComplexNum(ComplexNum b){
        int real = this.real + b.real;
        int virt = this.virt + b.virt;
        return new ComplexNum(real, virt);
    }
    
    public ComplexNum mulComplexNum(ComplexNum b){
        int real = this.real*b.real - this.virt*b.virt;
        int virt = this.real*b.virt + this.virt*b.real;
        return new ComplexNum(real, virt);
    }

    @Override
    public String toString() {
        char c = '+';
        if(this.virt < 0){
            c = '-';
        }
        return this.real + " " + c + " " + Math.abs(this.virt) + "i";
    }    
}

public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int real = sc.nextInt();
            int virt = sc.nextInt();
            ComplexNum a = new ComplexNum(real, virt);
            real = sc.nextInt();
            virt = sc.nextInt();
            ComplexNum b = new ComplexNum(real, virt);
            ComplexNum c = a.addComplexNum(b);
            c = c.mulComplexNum(a);
            ComplexNum d = a.addComplexNum(b);
            d = d.mulComplexNum(d);
            System.out.print(c);
            System.out.print(", ");
            System.out.println(d);
        }
    }
}
