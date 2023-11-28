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
class SinhVien  implements Comparable<SinhVien>{
    private String id;
    private String name;
    private String num;
    private String mail;

    public SinhVien(String id, String name, String num, String mail) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.mail = mail;
    }

    @Override
    public int compareTo(SinhVien b){
        String[] s1 = this.name.trim().split("\\s+");
        String[] s2 = b.name.trim().split("\\s+");
        String middleName1 = "";
        String middleName2 = "";
        for(int i=1; i<s1.length-1; i++)
            middleName1 += s1[i];
        for(int i=1; i<s2.length-1; i++)
            middleName2 += s2[i];
        if(!s1[s1.length-1].equals(s2[s2.length-1]))
            return s1[s1.length-1].compareTo(s2[s2.length-1]);
        if(!s1[0].equals(s2[0]))
            return s1[0].compareTo(s2[0]);
        if(!middleName1.equals(middleName2))
            return middleName1.compareTo(middleName2);
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.num + " " + this.mail;
    }
}

public class SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String num = sc.nextLine();
            String mail = sc.nextLine();
            a.add(new SinhVien(id, name, num, mail));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
