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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        double diem = getDiem();
        if(diem < 5)
            return "Yếu";
        else if(5 <= diem && diem < 6.5)
            return "Trung bình";
        else if(6.5 <= diem && diem < 7.5)
            return "Khá";
        else if(7.5 <= diem && diem < 9)
            return "Giỏi";
        return "Xuất sắc";
    }
    
    public void xuat(){
        System.out.println("+ Họ tên sinh viên: " + hoTen);
        System.out.println("\t- Ngành: " + nganh);
        System.out.println("\t- Điểm: " + getDiem());
        System.out.println("\t- Ngành: " + getHocLuc());
    }
}
