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
public class NguyenDinhHoangLan_59131178_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HocSinh h1 = new HocSinh("CNTT", "Van Nghe", "Van Toan", 21, "XYZ", "0123456789");
        HocSinh h2 = new HocSinh("Marketing", "Khong Co", "Chau Tran", 22, "ABC", "0987654321");
        HocSinh h3;
        h3= new HocSinh();
        
        GiaoVien gv1 = new GiaoVien("Quan tri mang", "Mang & Truyen thong", "Mai Cuong Tho", 69, "Na", "0291837564");
        GiaoVien gv2 = new GiaoVien("Toan roi rac", "Mang & Truyen thong", "Do Nhu An", 69, "Na", "0918273645");
        LopHoc lh = new LopHoc();
        lh.themHocSinh(h1);
        lh.themHocSinh(h2);
        lh.themHocSinh(h3);
        
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        
        lh.inDSHS();
        lh.inDSGVGD();
    }
    
}
