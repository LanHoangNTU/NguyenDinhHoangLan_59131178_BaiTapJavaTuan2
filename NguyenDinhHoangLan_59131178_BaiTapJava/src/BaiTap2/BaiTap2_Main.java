/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author Admin
 */
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien ql = new QuanLyNhanVien();
        
        NhanVien nv1 = new NhanVien("Nguyen Van A", 20, "A1", 3000000, 1000);
        NhanVien nv2 = new NhanVien("Nguyen Van B", 21, "A2", 3500000, 2000);
        NhanVien nv3 = new NhanVien("Nguyen Van C", 22, "A3", 3600000, 3000);
        NhanVien nv4 = new NhanVien("Nguyen Van D", 23, "B1", 3900000, 2000);
        NhanVien nv5 = new NhanVien("Nguyen Van E", 24, "C1", 3990000, 1000);
        
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        
        ql.inDS();
    }
    
}
