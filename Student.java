package Buoi3;

import java.util.ArrayList;

class SinhVien {
    private final String ma;
    private String hoTen;
    private int namSinh;

    public SinhVien(String ma, String hoTen, int namSinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}

class QuanLySinhVien {
    private final ArrayList<SinhVien> danhSachSinhVien;

    public QuanLySinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public void xoaSinhVien(String ma) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMa().equals(ma)) {
                danhSachSinhVien.remove(i);
                break;
            }
        }
    }

    public void capNhatSinhVien(String ma, String hoTen, int namSinh) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa().equals(ma)) {
                sinhVien.setHoTen(hoTen);
                sinhVien.setNamSinh(namSinh);
                break;
            }
        }
    }

    public SinhVien timSinhVienTheoMa(String ma) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa().equals(ma)) {
                return sinhVien;
            }
        }
        return null;
    }

    public ArrayList<SinhVien> timSinhVienTheoTen(String ten) {
        ArrayList<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().contains(ten)) {
                ketQua.add(sinhVien);
            }
        }
        return ketQua;
    }

    public void sapXepDanhSachTheoMa() {
        danhSachSinhVien.sort((s1, s2) -> s1.getMa().compareToIgnoreCase(s2.getMa()));
    }
}