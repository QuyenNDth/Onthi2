package service;

import entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();
    public void add(SinhVien sv){
        if(sv == null){
            throw new IllegalArgumentException("sv null");
        }
        list.add(sv);
    }
    public void update(SinhVien sv){
        if(sv == null){
            throw new IllegalArgumentException("sv null");
        }
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getMaSV().equals(sv.getMaSV())){
                list.set(i,sv);
                return;
            } else {
                throw new IllegalArgumentException("mã" + sv.getMaSV() + "không tồn tại");
            }
        }
    }
    public List<SinhVien> getAll(){
        return new ArrayList<>(list);
    }
    public SinhVien findMa(String ma){
        for (SinhVien sv: list){
            if (sv.getMaSV().equals(ma)){
                return sv;
            }
        }
        return null;
    }

}
