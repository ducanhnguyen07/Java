/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        while(true){
            int fl = 1;
            String tmp = sb.toString();
            for(int i=0; i<tmp.length()-1; i++){
                if(tmp.charAt(i) == tmp.charAt(i+1)){
                    fl = 0;
                    sb.delete(i, i+2);
                    break;
                }
            }
            if(fl == 1)
                break;
        }
        String st = sb.toString();
        if(st.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(sb.toString());
    }
}
