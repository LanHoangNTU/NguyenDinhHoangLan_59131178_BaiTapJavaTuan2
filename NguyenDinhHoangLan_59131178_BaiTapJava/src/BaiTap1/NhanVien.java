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
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    //Constructors
    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    //Getters and Setters
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    //Methods
    public String getThongTin(){
        return "Ten: " + ten + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi + ", Tien luong: " + tienLuong + ", Tong gio lam: " + tongGioLam + '.';
    }
    
    public double tinhThuong(){
        double tienThuong;
        if(tongGioLam >=200)
            tienThuong = tienLuong * 0.2;
        else if(tongGioLam < 200 && tongGioLam >= 100)
            tienThuong = tienLuong * 0.1;
        else
            tienThuong = 0;
        return tienThuong;
    }
}
