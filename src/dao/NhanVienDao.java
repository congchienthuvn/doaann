/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author cong1
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import model.NhanVien;
import database.JDBCUtil;
    import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.net.ConnectException;
import java.sql.SQLException;
public class NhanVienDao implements DaoInterface<NhanVien> {
    public static NhanVienDao getInstance(){
        
        return new NhanVienDao();
        
    }

    @Override
    public int insert(NhanVien t) {
        int kq=0;
        try {
            Connection connect = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhanVien(MaNguoiDung,MaNhanVien,TenNhanVien,NgaySinh,Email,GioiTinh,SDT,isDelete) Values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, t.getMaNhanVien());
            pst.setString(2, t.getTenNhanVien());
            pst.setString(3, t.getNgaySinh());
            pst.setString(4, t.getEmail());
            pst.setString(5, t.getGioiTinh());
            pst.setString(6, t.getSDT());
            pst.setInt (7,t.getIsDelete());
            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(connect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(NhanVien t) {
        int kq = 0;
        try {
            Connection connect = JDBCUtil.getConnection();
            String sql="Update NhanVien Set MaNguoiDung=? MaNhanVien = ?,TenNhanVien= ?, NgaySinh=?,Email=?,GioiTinh=?,SDT=?,isDelete=? Where MaNhanVien=?";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, t.getMaNhanVien());
            pst.setString(2, t.getTenNhanVien());
            pst.setString(3, t.getNgaySinh());
            pst.setString(4, t.getEmail());
            pst.setString(5, t.getGioiTinh());
            pst.setString(6, t.getSDT());
            pst.setInt (7,t.getIsDelete());
            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(connect);
        } catch (SQLException e) {
             e.printStackTrace();
        }return kq;
 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(NhanVien t) {
         int ketQua = 0;
  try {
      Connection con = JDBCUtil.getConnection();
      String sql = "DELETE FROM NhanVien WHERE TenNhanVien=?";
      PreparedStatement pst = con.prepareStatement(sql);
      pst.setString(1, t.getTenNhanVien());
      ketQua = pst.executeUpdate();
      JDBCUtil.closeConnection(con);

  } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
  }
  return ketQua;
 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanVien> SelectAll() {
         ArrayList<NhanVien> kq = new ArrayList<NhanVien>();
 try {
     Connection con = JDBCUtil.getConnection();
     String sql = "SELECT * FROM NhanVien";
     PreparedStatement pst = con.prepareStatement(sql);
     ResultSet rs = pst.executeQuery();
     while (rs.next()) {
         String MaNguoiDung =rs.getString("MaNguoiDung");
         String MaNhanVien = rs.getString("MaNhanVien");
         String TenNhanVien = rs.getString("TenNhanVien");
         String NgaySinh = rs.getString("NgaySinh");
         String Email = rs.getString("email");
         String GioiTinh = rs.getString("GioiTinh");
         String SDT = rs.getString("SDT");
         int isDelete= rs.getInt("isDelete");
         NhanVien acc = new NhanVien(MaNhanVien, TenNhanVien, NgaySinh, Email, GioiTinh,SDT,isDelete);
         kq.add(acc);
     }
 } catch (Exception e) {
     // TODO: handle exception
     e.printStackTrace();
 }
 return kq; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien search(String t) {
       NhanVien kq = null;
try {
    Connection con = JDBCUtil.getConnection();
    String sql = "SELECT * FROM NhanVien WHERE TenNhanVien=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, t);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
        String MaNguoiDung =rs.getString("MaNguoiDung");
       String MaNhanVien = rs.getString("MaNhanVien");
         String TenNhanVien = rs.getString("TenNhanVien");
         String NgaySinh = rs.getString("NgaySinh");
         String Email = rs.getString("email");
         String GioiTinh = rs.getString("GioiTinh");
         String SDT = rs.getString("SDT");
         int isDelete= rs.getInt("isDelete");
        kq = new NhanVien(MaNhanVien, TenNhanVien, NgaySinh, Email, GioiTinh,SDT,isDelete);
    }
    JDBCUtil.closeConnection(con);
} catch (Exception e) {
   e.printStackTrace();
}
           
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          return kq;
    }
}
