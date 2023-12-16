/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if (!st.empty() && s.charAt(i) == ')' && st.peek() == '(')
                    st.pop();
                else if (!st.empty() && s.charAt(i) == ']' && st.peek() == '[')
                    st.pop();
                else if (!st.empty() && s.charAt(i) == '}' && st.peek() == '{')
                    st.pop();
                else if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '[' || s.charAt(i) == ']' || s.charAt(i) == '{' || s.charAt(i) == '}')
                    st.push(s.charAt(i));
            }
            if(st.isEmpty()){
                System.out.println("YES");
            }
            else 
                System.out.println("NO");
        }
    }
}
