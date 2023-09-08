/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class TachDoiVaTinhTong { 
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            String s = sc.nextLine();
            while(s.length() > 1){
                BigInteger a = new BigInteger(s.substring(0, s.length()/2));
                BigInteger b = new BigInteger(s.substring(s.length()/2));
                s = a.add(b).toString();
                System.out.println(s);
            }
        } catch(Exception e){
            
        }
    }
}
