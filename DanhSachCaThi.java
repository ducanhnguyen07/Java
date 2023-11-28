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
class CaThi implements Comparable<CaThi>{
    private String id;
    private String date;
    private String time;
    private String idRoom;

    public CaThi(int id, String date, String time, String idRoom) {
        this.id = "C" + String.format("%03d", id);
        this.date = date;
        this.time = time;
        this.idRoom = idRoom;
    }
    
    @Override
    public int compareTo(CaThi b){
        String cmp1 = this.date.substring(6) + this.date.substring(3, 5)
                    + this.date.substring(0, 2) + this.time;
        String cmp2 = b.date.substring(6) + b.date.substring(3, 5)
                    + b.date.substring(0, 2) + b.time;
        if(!cmp1.equals(cmp2))
            return cmp1.compareTo(cmp2);
        return this.id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.date + " " + this.time + " " + this.idRoom; 
    }
}

public class DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        ArrayList<CaThi> a = new ArrayList<>();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            String date = sc.nextLine();
            String time = sc.nextLine();
            String idRoom = sc.nextLine();
            a.add(new CaThi(i, date, time, idRoom));
        }
        Collections.sort(a);
        for(CaThi i : a){
            System.out.println(i);
        }
    }
}
