/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Administrator
 */
import java.util.*;

public class CapSoCoTongBangK {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextInt();
            long[] a = new long[n+5];
            HashMap<Long, Long> m = new HashMap<>();
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            long cnt = 0;
            for(int i=0; i<n; i++){
                if(m.containsKey(k - a[i])){
                    cnt += m.get(k - a[i]);
                }
                if(m.get(a[i]) != null){
                    m.put(a[i], m.get(a[i]) + 1);
                }
                else 
                    m.put(a[i], (long)1);
            }
            System.out.println(cnt);
        }
    }
}
