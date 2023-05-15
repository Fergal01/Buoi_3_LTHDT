package Buoi3;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        // Thêm sinh viên
        quanLySinhVien.themSinhVien(new SinhVien("SV001", "Nguyễn Văn A", 1998));
        quanLySinhVien.themSinhVien(new SinhVien("SV002", "Trần Thị B", 1999));
        quanLySinhVien.themSinhVien(new SinhVien("SV003", "Lê Văn C", 2000));
        quanLySinhVien.themSinhVien(new SinhVien("SV004", "Phạm Thị D", 1997));
        quanLySinhVien.themSinhVien(new SinhVien("SV005", "Hoàng Văn E", 1996));

        // Lấy danh sách sinh viên
        ArrayList<SinhVien> danhSachSinhVien = quanLySinhVien.getDanhSachSinhVien();
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        // Thêm sinh viên mới
        quanLySinhVien.themSinhVien(new SinhVien("SV006", "Nguyễn Thị F", 2001));
        System.out.println("Danh sách sinh viên sau khi thêm sinh viên mới:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        // Xóa sinh viên khi biết mã
        quanLySinhVien.xoaSinhVien("SV003");
        System.out.println("Danh sách sinh viên sau khi xóa một sinh viên:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        // Sửa thông tin sinh viên
        quanLySinhVien.capNhatSinhVien("SV004", "Phạm Thị D", 1998);
        System.out.println("Danh sách sinh viên sau khi cập nhật thông tin sinh viên:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        // Tìm kiếm sinh viên theo mã
        SinhVien sinhVienTheoMa = quanLySinhVien.timSinhVienTheoMa("SV002");
        System.out.println("Sinh viên được tìm thấy theo mã: " + sinhVienTheoMa);

        // Tìm kiếm sinh viên theo tên
        ArrayList<SinhVien> sinhVienTheoTen = quanLySinhVien.timSinhVienTheoTen("Nguyễn");
        System.out.println("Danh sách sinh viên được tìm thấy theo tên:");
        for (SinhVien sinhVien : sinhVienTheoTen) {
            System.out.println(sinhVien);
        }

        // Sắp xếp danh sách sinh viên theo mã tăng dần
        quanLySinhVien.sapXepDanhSachTheoMa();

        System.out.println("Sắp xếp danh sách sinh viên theo mã tăng dần:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }
}
