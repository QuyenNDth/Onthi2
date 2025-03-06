package entity;

public class SinhVien {
    private String maSV;
    private String ten;
    private Integer tuoi;
    private Float diemTB;
    private Integer kyHoc;
    private String chuyenNganh;

    public SinhVien(String maSV, String ten, Integer tuoi, Float diemTB, Integer kyHoc, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("Tên sai");
        }
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        if (tuoi == null) {
            throw new IllegalArgumentException("Tuổi không được để trống");
        }
        if (tuoi > 18) {
            throw new IllegalArgumentException("Tuổi phải lớn hơn 18");
        }
        this.tuoi=tuoi;
    }

    public Float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Float diemTB) {
        if (diemTB == null){
            throw new IllegalArgumentException("Điểm không trống");
        }
        else if(diemTB <  0 || diemTB > 10){
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }
        this.diemTB = diemTB;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        if(kyHoc == null){
            throw new IllegalArgumentException("Kỳ học không được trống");
        }
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if(chuyenNganh == null || chuyenNganh.isEmpty()){
            throw new IllegalArgumentException("chuyên ngành trống");
        }
        this.chuyenNganh = chuyenNganh;
    }
}
