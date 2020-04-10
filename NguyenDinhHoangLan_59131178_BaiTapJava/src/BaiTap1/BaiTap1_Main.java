/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Admin
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Nguyen Van A", 26, "420 Luong Van Can", 6000000, 4200);
        NhanVien nv2 = new NhanVien();
        
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
    
}
