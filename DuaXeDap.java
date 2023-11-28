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
class CuaRo implements Comparable<CuaRo>{
    private String name;
    private String address;
    private String time;

    public CuaRo(String name, String address, String time) {
        this.name = name;
        this.address = address;
        this.time = time;
    }
    
    private String getID(){
        String[] s1 = this.name.split("\\s+");
        String[] s2 = this.address.split("\\s+");
        String s = "";
        for(String i : s2)
            s += Character.toString(i.charAt(0)).toUpperCase();
        for(String i : s1)
            s += Character.toString(i.charAt(0)).toUpperCase();
        return s;
    }
    
    private double getArchive(){
        double time = Integer.parseInt(this.time.substring(0, 1))
                + Integer.parseInt(this.time.substring(2)) / 60.0 - 6.0;
        double res = 120.0 / time;
        return res;
    }
    
    @Override
    public int compareTo(CuaRo b){
        return -Double.compare(this.getArchive(), b.getArchive());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f Km/h", this.getID(), this.name
                , this.address, this.getArchive());
    }
}

public class DuaXeDap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<CuaRo> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            String address = sc.nextLine();
            String time = sc.nextLine();
            a.add(new CuaRo(name, address, time));
        }
        Collections.sort(a);
        for(CuaRo i : a){
            System.out.println(i);
        }
    }
}
