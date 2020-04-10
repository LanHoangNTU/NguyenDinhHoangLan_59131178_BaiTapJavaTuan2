/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyendinhhoanglan_59131178_bt1;

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh() {
        lop = "Na";
        nangKhieu = "Na";
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public void hienThiTT(){
        System.out.print("Ho Ten: " + getHoTen() + "\t");
        System.out.print("Tuoi: " + getTuoi() + "\t");
        System.out.print("Dia Chi: " + getDiaChi() + "\t");
        System.out.print("Sdt: " + getSdt() + "\t");
        System.out.print("Lop: " + lop + "\t");
        System.out.println("Nang Khieu: " + nangKhieu);
    }
}
