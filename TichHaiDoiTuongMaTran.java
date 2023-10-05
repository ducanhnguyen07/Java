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
    private int[][] m;
    private int row;
    private int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.m = new int[row][col];
    }
    
    public void nextMatrix(Scanner sc){
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                this.m[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(this.row, b.col);
        for(int i=0; i<this.row; i++){
            for(int j=0; j<b.col; j++){
                for(int k=0; k<this.col; k++){
                    res.m[i][j] += this.m[i][k] * b.m[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                s += this.m[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

public class TichHaiDoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
