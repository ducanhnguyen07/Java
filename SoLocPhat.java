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
public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> Q = new LinkedList<>();
            ArrayList<String> a = new ArrayList<>();
            Q.offer("6");
            Q.offer("8");
            while(true){
                String top = Q.poll();
                if(top.length() > n)
                    break;
                a.add(top);
                Q.offer(top + "6");
                Q.offer(top + "8");
            }
            System.out.println(a.size());
            for(int i=a.size()-1; i>=0; i--){
                System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }
}
