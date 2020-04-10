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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSale;

    public SinhVienBiz(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSale)/3;
    }
}
