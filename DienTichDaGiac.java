/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
/**
 *
 * @author Administrator
 */
class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class DienTichDaGiac {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Point> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                a.add(new Point(x, y));
            }
            a.add(a.get(0));
            long s1 = 0;
            long s2 = 0;
            for(int i=0; i<a.size()-1; i++){
                s1 += a.get(i).getX() * a.get(i+1).getY();
                s2 += a.get(i).getY() * a.get(i+1).getX();
            }
            System.out.printf("%.3f\n", (double)(s1 - s2)/2.0);
        }
    }
}
