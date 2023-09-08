/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TichMaTranVoiChuyenViCuaNo { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q = t;
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    b[i][j] = a[j][i];
                }
            }
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    c[i][j] = 0;
                }
            }
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    for(int k=0; k<m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", q-t);
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.printf("%d ", c[i][j]);
                }
                System.out.println();
            }
        }
    }
}
