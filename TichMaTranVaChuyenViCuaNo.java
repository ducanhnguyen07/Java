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
class Matrix{
    private int r;
    private int c;
    private int[][] a;

    public Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        this.a = new int[r][c];
    }
    
    public void nextMatrix(Scanner sc){
        for(int i=0; i<this.r; i++){
            for(int j=0; j<this.c; j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans(){
        Matrix b = new Matrix(this.c, this.r);
        for(int i=0; i<this.c; i++){
            for(int j=0; j<this.r; j++){
                b.a[i][j] = this.a[j][i];
            }
        }
        return b;
    }
    
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(this.r, this.r);
        for(int i=0; i<this.r; i++){
            for(int j=0; j<b.c; j++){
                for(int k=0; k<this.c; k++){
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i=0; i<this.r; i++){
            for(int j=0; j<this.c; j++){
                s += this.a[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

public class TichMaTranVaChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }

}
