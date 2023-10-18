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
class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private String ns;

    public Nguoi(String ten, String ns) {
        this.ten = ten;
        this.ns = ns;
    }
    
    public String getNgaySinh(){
        return this.ns.substring(6) + this.ns.substring(3, 5)
                    + this.ns.substring(0, 2);
    }
    
    @Override
    public int compareTo(Nguoi b){
        return -this.getNgaySinh().compareTo(b.getNgaySinh());
    }

    @Override
    public String toString() {
        return this.ten;
    }
}
public class TreNhatGiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Nguoi> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            String ten = sc.next();
            String ns = sc.next();
            a.add(new Nguoi(ten, ns));
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(n-1));
    }
}
