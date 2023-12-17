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
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            Stack<Integer> st = new Stack<>();
            String s = sc.nextLine();
            st.push(-1);
            int res = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '(')
                    st.push(i);
                else{
                    st.pop();
                    if(!st.empty())
                        res = Integer.max(i - st.peek(), res);
                    else
                        st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
