/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyendinhhoanglan_59131178_bt1;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS{
    ArrayList<CaNhan> dsCaNhan;

    public QLDS() {
        dsCaNhan = new ArrayList();
    }

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }

    public ArrayList<CaNhan> getDsCaNhan() {
        return dsCaNhan;
    }

    public void setDsCaNhan(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }

    @Override
    public int them(CaNhan p) {
        if(dsCaNhan.add(p))
            return 1;
        return 0;
    }

    @Override
    public int xoa(String ten) {
        int result = 0;
        int size = dsCaNhan.size();
        for(int i = 0; i < size; i++){
            if(dsCaNhan.get(i).getHoTen().equals(ten)){
                dsCaNhan.remove(i);
                result = 1;
            }
        }
        return result;
    }

    @Override
    public void inDS() {
        int size = this.dsCaNhan.size();
        for(int i=0; i<size; i++){
            this.dsCaNhan.get(i).hienThiTT();
        }
    }
}
