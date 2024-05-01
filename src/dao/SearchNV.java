/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author cong1
 */
public class SearchNV {
    
     public static SearchNV getInstance() {
        return new SearchNV();
    }

    public ArrayList<NhanVien> searchAll(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> arr = NhanVienDao.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getMaNguoiDung().toLowerCase().contains(text.toLowerCase())
                    || ncc.getMaNhanVien().toLowerCase().contains(text.toLowerCase())
                    || ncc.getTenNhanVien().toLowerCase().contains(text.toLowerCase())
                    || ncc.getNgaySinh().toLowerCase().contains(text.toLowerCase())
                    || ncc.getEmail().toLowerCase().contains(text.toLowerCase())
                    || ncc.getGioiTinh().toLowerCase().contains(text.toLowerCase())
                    || ncc.getSDT().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
public ArrayList<NhanVien> searchMaNguoiDung(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> arr = NhanVienDao.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getMaNguoiDung().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
    public ArrayList<NhanVien> searchMa(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> arr = NhanVienDao.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getMaNhanVien().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchTaiKhoan(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> arr = NhanVienDao.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getTenNhanVien().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchNgaySinh(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDao.getInstance().SelectAll();
        for (var ncc : armt) {
            if (ncc.getNgaySinh().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
    
    
    public ArrayList<NhanVien> searchEmail(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armtt = NhanVienDao.getInstance().SelectAll();
        for (var ncc : armtt) {
            if (ncc.getEmail().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
    public ArrayList<NhanVien> searchGioiTinh(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armtr = NhanVienDao.getInstance().SelectAll();
        for (var ncc : armtr) {
            if (ncc.getGioiTinh().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
public ArrayList<NhanVien> searchSDT(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armtw = NhanVienDao.getInstance().SelectAll();
        for (var ncc : armtw) {
            if (ncc.getSDT().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }


}
