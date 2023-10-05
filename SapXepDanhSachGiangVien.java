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
class GiangVien implements Comparable<GiangVien>{
    private String id;
    private String ten;
    private String khoa;

    public GiangVien(int id, String ten, String khoa) {
        this.id = "GV" + String.format("%02d", id);
        this.ten = ten;
        this.khoa = khoa;
    }
    
    public String getTen(){
        StringTokenizer st = new StringTokenizer(this.ten);
        ArrayList<String> a = new ArrayList<>();
        while(st.hasMoreTokens()){
            a.add(st.nextToken());
        }
        return a.get(a.size()-1);
    }

    @Override
    public int compareTo(GiangVien b){
        if(this.getTen().compareTo(b.getTen()) != 0)
            return this.getTen().compareTo(b.getTen());
        return this.id.compareTo(b.id);
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.khoa;
    }
}

public class SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiangVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String khoa = "";
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                khoa += st.nextToken().charAt(0);
            }
            a.add(new GiangVien(i, ten, khoa.toUpperCase()));
        }
        Collections.sort(a);
        for(GiangVien i : a){
            System.out.println(i);
        }
    }
}
