/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.time.*;
/**
 *
 * @author Administrator
 */
class Station{
    private String id;
    private String name;
    private double rainFall;
    private double hours;

    public Station(int id, String name, double rainFall) {
        this.id = "T" + String.format("%02d", id);
        this.name = name;
        this.rainFall = rainFall;
    }

    public String getName() {
        return name;
    }

    public double getRainFall() {
        return rainFall;
    }

    public void setRainFall(double rainFall) {
        this.rainFall = rainFall;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    private double getAvgOfRainfall(){
        double h = (int)(this.hours / 60.0);
        h += (this.hours - h*60) / 60.0; 
        return this.rainFall / h;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.id, this.name, this.getAvgOfRainfall());
    }
}

public class LuongMuaTrungBinh {
    public static long calMin(String st, String fi){
        LocalTime t1 = LocalTime.parse(st);
        LocalTime t2 = LocalTime.parse(fi);
        return t1.until(t2, java.time.temporal.ChronoUnit.MINUTES);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Station> a = new ArrayList<>();
        int cnt = 1;
        boolean fl;
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String st = sc.nextLine();
            String fi = sc.nextLine();
            double rainFall = sc.nextDouble();
            
            fl = true;
            for(Station j : a){
                if(j.getName().equals(name)){
                    j.setHours(j.getHours() + calMin(st, fi));
                    j.setRainFall(j.getRainFall() + rainFall);
                    fl = false;
                    break;
                }
            }
            if(fl){
                Station x = new Station(cnt++, name, rainFall);
                x.setHours(calMin(st, fi));
                a.add(x);
            }
        }
        for(Station i : a){
            System.out.println(i);
        }
    }
}
