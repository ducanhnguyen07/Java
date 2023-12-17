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
public class So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> Q = new LinkedList<>();
            Q.offer("0");
            Q.offer("9");
            while (true) {                
                String top = Q.poll();
                if(Long.parseLong(top) % n == 0 && top.charAt(0) != '0'){
                    System.out.println(top);
                    break;
                }
                Q.offer(top + "0");
                Q.offer(top + "9");
            }
        }
    }
}
