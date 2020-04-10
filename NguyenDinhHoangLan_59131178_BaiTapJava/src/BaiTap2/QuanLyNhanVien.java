/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList();
    }

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        int size = dsNhanVien.size();
        for(int i = 0; i < size; i++){
            System.out.print("Nv " + (i+1));
            System.out.println(' ' + dsNhanVien.get(i).getThongTin());
        }
    }
    
    
}
