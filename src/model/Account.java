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
public class Account {
     private String MaNguoiDung;
    private String TaiKhoan;
    private String MatKhau;
    private String Phamvitruycap;
private int isDelete;
    // Constructor

    public Account() {
    }

    public Account(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    

    public Account(String MaNguoiDung, String TaiKhoan, String MatKhau, String Phamvitruycap,int isDelete) {
        this.MaNguoiDung = MaNguoiDung;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.Phamvitruycap = Phamvitruycap;
        this.isDelete=isDelete;
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getPhamvitruycap() {
        return Phamvitruycap;
    }

    public void setPhamvitruycap(String Phamvitruycap) {
        this.Phamvitruycap = Phamvitruycap;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     * @return
     */
    @Override
    public int  hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.MaNguoiDung);
        hash = 71 * hash + Objects.hashCode(this.TaiKhoan);
        hash = 71 * hash + Objects.hashCode(this.MatKhau);
        hash = 71 * hash + Objects.hashCode(this.Phamvitruycap);
        hash = 71 * hash + this.isDelete;
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
        final Account other = (Account) obj;
        
          if (!this.MaNguoiDung.equals(other.MaNguoiDung)) {
            return false;
        }
        if (!Objects.equals(this.TaiKhoan, other.TaiKhoan)) {
            return false;
        }
        if (!Objects.equals(this.MatKhau, other.MatKhau)) {
            return false;
        }
        if (!Objects.equals(this.Phamvitruycap, other.Phamvitruycap)) {
            return false;
        }
       
        return Objects.equals(this.isDelete, other.isDelete);     
    }

    @Override
    public String toString() {
        return "Account{" + "MaNguoiDung=" + MaNguoiDung + ", TaiKhoan=" + TaiKhoan + ", MatKhau=" + MatKhau + ", Phamvitruycap=" + Phamvitruycap + ", isDelete=" + isDelete + '}';
    }

    public void getMatKhau(String pass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
        
        
    }

    
