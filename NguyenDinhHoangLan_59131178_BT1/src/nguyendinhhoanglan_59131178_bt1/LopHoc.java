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
public class LopHoc {
    QLDS qldsGVGD;
    QLDS qldsHS;
    GiaoVien giaoVienCN;

    public LopHoc() {
        qldsGVGD = new QLDS();
        qldsHS = new QLDS();
        giaoVienCN = new GiaoVien();
    }

    public LopHoc(QLDS qldsGVGD, QLDS qldsHS, GiaoVien giaoVienCN) {
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
        this.giaoVienCN = giaoVienCN;
    }

    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }

    public GiaoVien getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    public int themHocSinh(HocSinh hs){
        boolean condition;
        if(qldsHS.them(hs)!=0)
            return 1;
        else{
            qldsHS.xoa(hs.getHoTen());
        }
        return 0;
    }
    
    public int themGVGD(GiaoVien gv){
        boolean condition;
        if(qldsGVGD.them(gv)!=0)
            return 1;
        else{
            qldsGVGD.xoa(gv.getHoTen());
        }
        return 0;
    }
    
    public int inDSHS(){
        System.out.println("Danh Sach Hoc Sinh:");
        qldsHS.inDS();
        return 1;
    }
    
    public int inDSGVGD(){
        System.out.println("Danh Sach GVGD:");
        qldsGVGD.inDS();
        return 1;
    }
}
