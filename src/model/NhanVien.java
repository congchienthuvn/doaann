/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author cong1
 */

public class NhanVien extends Account{
    private String MaNhanVien;
    private String TenNhanVien;
    private String NgaySinh;
    private String Email;
    private String GioiTinh;
    private String SDT;
    private int isDelete;
    
    public NhanVien() {
    }
    
   

    public NhanVien(String MaNhanVien, String TenNhanVien, String NgaySinh, String Email, String GioiTinh, String SDT, int isDelete) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.isDelete = isDelete;
    }

    public NhanVien(String MaNguoiDung,String MaNhanVien, String TenNhanVien, String NgaySinh, String Email, String GioiTinh, String SDT, int isDelete) {
        super(MaNguoiDung);
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.isDelete = isDelete;
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String NgaySinh, String Email, String GioiTinh, String SDT,  String MaNguoiDung, String TaiKhoan, String MatKhau, String Phamvitruycap, int isDelete) {
        super(MaNguoiDung, TaiKhoan, MatKhau, Phamvitruycap, isDelete);
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.isDelete = isDelete;
    }

   

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

   

   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.MaNhanVien);
        hash = 67 * hash + Objects.hashCode(this.TenNhanVien);
        hash = 67 * hash + Objects.hashCode(this.NgaySinh);
        hash = 67 * hash + Objects.hashCode(this.Email);
        hash = 67 * hash + Objects.hashCode(this.GioiTinh);
        hash = 67 * hash + Objects.hashCode(this.SDT);
        hash = 67 * hash + this.isDelete;
         return hash;
   
    
}
    @Override
    
     public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        if (this.MaNhanVien != other.MaNhanVien) {
            return false;
        }
        if (!Objects.equals(this.TenNhanVien, other.TenNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.NgaySinh, other.NgaySinh)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.GioiTinh, other.GioiTinh)) {
            return false;
        }
        return Objects.equals(this.SDT, other.SDT);     
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNhanVien=" + MaNhanVien + ", TenNhanVien=" + TenNhanVien + ", NgaySinh=" + NgaySinh + ", Email=" + Email + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", isDelete=" + isDelete + '}';
    }

    


    
    }
   

   
