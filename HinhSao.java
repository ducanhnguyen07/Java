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
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        for(int i=1; i<=n-1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            a.get(u).add(v);
            a.get(v).add(u);
        }
        int fl = 0;
        for(ArrayList i : a){
            if(i.size() == n - 1){
                System.out.println("Yes");
                fl = 1;
                break;
            }
        }
        if(fl == 0){
            System.out.println("No");
        }
    }
}
