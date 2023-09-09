/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
class ThoiGian{
    private int hour;
    private int minute;
    private int second;

    public ThoiGian(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getTime(){
        return this.hour*3600 + this.minute*60 + this.second;
    }

    @Override
    public String toString() {
        return this.hour + " " + this.minute + " " + this.second;
    }
    
}

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThoiGian> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            a.add(new ThoiGian(hour, minute, second));
        }
        Collections.sort(a, new Comparator<ThoiGian>(){
            public int compare(ThoiGian a, ThoiGian b){
                return a.getTime() - b.getTime();
            }
        });
        for(ThoiGian i : a){
            System.out.println(i);
        }
    }
}
