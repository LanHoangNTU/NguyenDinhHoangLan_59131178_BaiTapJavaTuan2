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
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public GiaoVien() {
        monDay = "Na";
        toBoMon = "Na";
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    @Override
    public void hienThiTT(){
        System.out.print("Ho Ten: " + getHoTen() + "\t");
        System.out.print("Tuoi: " + getTuoi() + "\t");
        System.out.print("Dia Chi: " + getDiaChi() + "\t");
        System.out.print("Sdt: " + getSdt() + "\t");
        System.out.print("Mon Day: " + monDay + "\t");
        System.out.println("To Bo Mon: " + toBoMon);
    }
}
