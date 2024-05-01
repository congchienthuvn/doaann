/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
  import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import javax.swing.JOptionPane;
import model.Account;
/**
 *
 * @author cong1
 */public class AccountDAO implements DaoInterface<Account> {

    public static AccountDAO getInstance() {
        return new AccountDAO();
    }
     @Override
    public int insert(Account t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Account (MaNguoiDung, TaiKhoan, MatKhau,Phamvitruycap,isDelete) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,  t.getMaNguoiDung());
                pst.setString(2, t.getTaiKhoan());
                pst.setString(3, t.getMatKhau());
                pst.setString(4, t.getPhamvitruycap());
                pst.setInt(5, t.getIsDelete());
               
            //Buoc 4 thuc thi cau lenh sql
            ketQua = pst.executeUpdate();
            //Buoc 5 Xu ly
            //Buoc 6 ngat ket noi den voi co so du lieu
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Account t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Account SET MaNguoiDung=?, MatKhau=?, Phamvitruycap=?, isDelete=? WHERE TaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNguoiDung());
            pst.setString(2, t.getTaiKhoan());
            pst.setString(3, t.getMatKhau());
            pst.setString(4, t.getPhamvitruycap());
            pst.setInt(6, t.getIsDelete());
           

            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Account t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM Account WHERE TaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTaiKhoan());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> SelectAll() {
        ArrayList<Account> ketQua = new ArrayList<Account>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Account";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MaNguoiDung = rs.getString("MaNguoiDung");
                String TaiKhoan = rs.getString("TaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String Phamvitruycap = rs.getString("Phamvitruycap");
                int isDelete = rs.getInt("isDelete");
              

                Account acc = new Account(MaNguoiDung, TaiKhoan, MatKhau, Phamvitruycap, isDelete);
                ketQua.add(acc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Account search(String t) {
        Account acc = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Account WHERE TaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               String MaNguoiDung = rs.getString("MaNguoiDung");
                String TaiKhoan = rs.getString("TaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String Phamvitruycap = rs.getString("Phamvitruycap");
                int isDelete = rs.getInt("isDelete");
                acc = new Account(MaNguoiDung, TaiKhoan, MatKhau, Phamvitruycap, isDelete);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return acc;
    }
    
        public int updatePassword(String TaiKhoan, String MatKhau) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Account SET MatKhau=? WHERE TaiKhoan=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, TaiKhoan);
            pst.setString(2, MatKhau);

            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

 
}
