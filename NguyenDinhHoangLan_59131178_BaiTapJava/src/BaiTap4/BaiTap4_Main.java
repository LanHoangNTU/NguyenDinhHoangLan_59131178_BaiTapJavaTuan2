/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author Admin
 */
public class BaiTap4_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuyenXe nt1 = new XeNoiThanh(10, 100, "1236QE", "Van A", "2123QE", 500000);
        ChuyenXe nt2 = new XeNoiThanh(11, 200, "4123QE", "Van E", "3123QE", 100000);
        ChuyenXe nt3 = new XeNoiThanh(12, 300, "1523QE", "Van B", "4123QE", 250000);
        
        ChuyenXe ngt1 = new XeNgoaiThanh("Morioh", 5, "1236QE", "Van A", "82123QE", 500000);
        ChuyenXe ngt2 = new XeNgoaiThanh("Masion Village", 2, "4123QE", "Van E", "93123QE", 100000);
        ChuyenXe ngt3 = new XeNgoaiThanh("Macho", 3, "1523QE", "Van B", "74123QE", 250000);
        
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        ql.themChuyenXe(nt1);
        ql.themChuyenXe(ngt1);
        ql.themChuyenXe(nt2);
        ql.themChuyenXe(nt3);
        ql.themChuyenXe(ngt2);
        ql.themChuyenXe(ngt3);
        
        ql.xuatDS();
        System.out.println("Tổng doanh thu nội thành: " + ql.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu ngoại thành: " + ql.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu cả hai loại xe: " + ql.tinhDoanhThuHaiLoai());
    }
    
}
