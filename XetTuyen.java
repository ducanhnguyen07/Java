/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
class Person {
    private String id;
    private String name;
    private String dob;
    private double tm;
    private double pm;

    public Person(int id, String name, String dob, double tm, double pm) {
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.dob = dob;
        this.tm = tm;
        this.pm = pm;
    }
    
    private double getAdd(){
        if(this.tm >= 8 && this.pm >= 8){
            return 1;
        }
        else if(this.tm >= 7.5 && this.pm >= 7.5){
            return 0.5;
        }
        return 0;
    }
    
    private int getMark(){
        int mark = (int)Math.round((this.tm + this.pm)/2.0 + this.getAdd());
        if(mark > 10)
            return 10;
        return mark;
    }
    
    public void conv(){
        String[] s = this.name.trim().split("\\s+");
        String cname = "";
        for(String i : s){
            cname +=  Character.toString(i.charAt(0)).toUpperCase()
                    + i.substring(1).toLowerCase() + " ";
        }
        this.name = cname.trim();
    }
    
    private String getRank(){
        if(this.getMark() < 5)
            return  "Truot";
        else if(this.getMark() < 7)
            return  "Trung binh";
        else if(this.getMark() < 8)
            return  "Kha";
        else if(this.getMark() < 9)
            return "Gioi";
        return "Xuat sac";
    }
    
    private int getAge(){
        return 2021 - Integer.parseInt(this.dob.substring(this.dob.lastIndexOf("/") + 1));
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.getAge() + " " +
                this.getMark() + " " + this.getRank();
    }
}

public class XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        ArrayList<Person> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String dob = sc.next();
            double tm = sc.nextDouble();
            double pm = sc.nextDouble();
            Person x = new Person(i, name, dob, tm, pm);
            x.conv();
            a.add(x);
        }
        for(Person i : a){
            System.out.println(i);
        }
    }
}
