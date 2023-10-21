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
class LoHang{
    private String id;
    private String ten;
    private double sl;
    private double dg;

    public LoHang(String ten, double sl, double dg) {
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        StringTokenizer st = new StringTokenizer(this.ten);
        String s1 = st.nextToken().toUpperCase();
        String s2 = st.nextToken().toUpperCase();
        this.id = String.format("%s", Character.toString(s1.charAt(0)) + Character.toString(s2.charAt(0)))
                + String.format("%02d", id);
    }
    
    public double getChietKhau(){
        if(this.sl > 10)
            return this.dg * this.sl * 0.05;
        else if(this.sl >= 8)
            return this.dg * this.sl * 0.02;
        else if(this.sl >= 5)
            return this.dg * this.sl * 0.01;
        return 0;
    }
    
    public double getThanhTien(){
        return this.dg * this.sl - this.getChietKhau();
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f", this.id, this.ten,
                this.getChietKhau(), this.getThanhTien());
    }
}
public class BangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<LoHang> a = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double sl = sc.nextDouble();
            double dg = sc.nextDouble();
            StringTokenizer st = new StringTokenizer(ten);
            String s1 = st.nextToken().toUpperCase();
            String s2 = st.nextToken().toUpperCase();
            String cmp = String.format("%s", Character.toString(s1.charAt(0))
                        + Character.toString(s2.charAt(0)));
            if(m.containsKey(cmp)){
                m.put(cmp, m.get(cmp) + 1);
            }
            else
                m.put(cmp, 1);
            LoHang x = new LoHang(ten, sl, dg);
            x.setId(m.get(cmp));
            a.add(x);
        }
        for(LoHang i : a){
            System.out.println(i);
        }
    }
}
