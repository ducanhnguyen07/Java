/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewNhanVien;

import java.util.*;
/**
 *
 * @author Administrator
 */
class KhachHang implements Comparable<KhachHang>{
    private String id;
    private String loaiSD;
    private double chiSoCu;
    private double chiSoMoi;

    public KhachHang(int id, String loaiSD, double chiSoCu, double chiSoMoi) {
        this.id = "KH" + String.format("%02d", id);
        this.loaiSD = loaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    
    public double getHeSo(){
        if(this.loaiSD.equals("KD"))
            return 3;
        else if(this.loaiSD.equals("NN"))
            return 5;
        else if(this.loaiSD.equals("TT"))
            return 4;
        return 2;
    }
    
    public double getThanhTien(){
        return (this.chiSoMoi - this.chiSoCu) * this.getHeSo() * 550;
    }
    
    public int getPhuTroi(){
        if(this.chiSoMoi - this.chiSoCu < 50)
            return 0;
        else if(this.chiSoMoi - this.chiSoCu <= 100)
            return (int)Math.ceil(this.getThanhTien() * 0.35);
        return (int)Math.ceil(this.getThanhTien());
    }
    
    public double getTongTien(){
        return this.getPhuTroi() + this.getThanhTien();
    }
    
    @Override
    public int compareTo(KhachHang b){
        return -Double.compare(this.getTongTien(), b.getTongTien());
    }

    @Override
    public String toString() {
        return String.format("%s %.0f %.0f %d %.0f", this.id, this.getHeSo(),
                this.getThanhTien(), this.getPhuTroi(), this.getTongTien());
    }
}

public class SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            double chiSoCu = sc.nextDouble();
            double chiSoMoi = sc.nextDouble();
            a.add(new KhachHang(i, id, chiSoCu, chiSoMoi));
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
