/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cong1
 */
 



import java.util.Objects;

/**
 *
 * @author cong1
 */
public class ThongKe {
    private String MaLaptop;
    private String TenLaptop;
    private int Nhap;
    private int Xuat;

    public ThongKe() {
    }

    public ThongKe(String MaLaptop, String TenLaptop, int Nhap, int Xuat) {
        this.MaLaptop = MaLaptop;
        this.TenLaptop = TenLaptop;
        this.Nhap = Nhap;
        this.Xuat = Xuat;
    }

    public String getMaLaptop() {
        return MaLaptop;
    }

    public void setMaLaptop(String MaLaptop) {
        this.MaLaptop = MaLaptop;
    }

    public String getTenLaptop() {
        return TenLaptop;
    }

    public void setTenLaptop(String TenLaptop) {
        this.TenLaptop = TenLaptop;
    }

    public int getNhap() {
        return Nhap;
    }

    public void setNhap(int Nhap) {
        this.Nhap = Nhap;
    }

    public int getXuat() {
        return Xuat;
    }

    public void setSlXuat(int Xuat) {
        this.Xuat = Xuat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.MaLaptop);
        hash = 53 * hash + Objects.hashCode(this.TenLaptop);
        hash = 53 * hash + this.Nhap;
        hash = 53 * hash + this.Xuat;
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
        final ThongKe other = (ThongKe) obj;
        if (this.Nhap != other.Nhap) {
            return false;
        }
        if (this.Xuat != other.Xuat) {
            return false;
        }
        if (!Objects.equals(this.MaLaptop, other.MaLaptop)) {
            return false;
        }
        return Objects.equals(this.TenLaptop, other.TenLaptop);
    }

    @Override
    public String toString() {
        return "ThongKe{" + "maMay=" + MaLaptop + ", tenMay=" + TenLaptop + ", Nhap=" + Nhap + ", Xuat=" + Xuat + '}';
    }
    
    
}

