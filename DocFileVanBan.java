/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class DocFileVanBan {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String s = sc.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }   
        
    }
}
