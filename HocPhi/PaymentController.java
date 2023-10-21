/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocPhi;

import java.util.*;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

/**
 *
 * @author Administrator
 */
public class PaymentController {
    private Student student;
    private ArrayList<Subject> alSubject;
    private Rule rule;
    private Invoice invoice;

    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String maSV = sc.nextLine();
        String tenSV = sc.nextLine();
        this.student = new Student(maSV, tenSV);
        int soMonHoc = sc.nextInt();
        this.alSubject = new ArrayList<>();
        for(int i=0; i<soMonHoc; i++){
            sc.nextLine();
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            int soTinChi = sc.nextInt();
            this.alSubject.add(new Subject(tenMH, maMH, soTinChi));
        }
        sc.nextLine();
        String maQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double donGia = sc.nextDouble();
        this.rule = new Rule(maQD, tenQD, donGia);
        
        double amount = 0;
        for(Subject i : this.alSubject)
            amount += i.getCredit() * rule.getCreditPrice();
        
        this.invoice = new Invoice(this.rule);
        invoice.setSt(this.student);
        invoice.setAlSubject(this.alSubject);
        invoice.setAmount(amount);
    }  

    public Invoice getInvoice() {
        return invoice;
    }
}
