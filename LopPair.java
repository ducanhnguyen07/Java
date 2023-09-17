/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.math.*;

/**
 *
 * @author Administrator
 */
class Pair<X extends Number, Y extends Number>{
    private X first;
    private Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }
    
    public boolean checkPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }

    public boolean isPrime(){
        return checkPrime((Integer)this.first) && checkPrime((Integer)this.second);
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }
}

public class LopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }

}
