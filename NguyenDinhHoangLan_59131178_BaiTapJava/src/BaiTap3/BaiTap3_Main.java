/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly it = new SinhVienIT(9, 10, 2, "Nguyên Văn Y Tê", "Công nghệ tông tin");
        SinhVienPoly biz = new SinhVienBiz(10, 10, "Mã Kết Trinh", "Marketing");
        //Khong the khoi tao lop truu tuong SinhVienPoly
        
        it.xuat();
        biz.xuat();
    }
    
}
