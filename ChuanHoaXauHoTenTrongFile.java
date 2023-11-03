/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine().trim();
            if(s.equals("END"))
                break;
            String[] a = s.split("\\s+");
            String res = "";
            for(String i : a){
                res += Character.toString(i.charAt(0)).toUpperCase()
                        + i.substring(1).toLowerCase() + " ";
            }
            System.out.println(res.trim());
        }
    }
}
