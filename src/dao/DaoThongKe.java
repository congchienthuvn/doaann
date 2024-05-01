package dao;


 


/**
 *
 * @author cong1
 */

import dao.CreateDate;
import database.JDBCUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import model.ThongKe;
import java.sql.*;
import java.sql.PreparedStatement;
public class DaoThongKe {

    public static DaoThongKe getInstance() {
        return new DaoThongKe() ;
    }
    public ArrayList<ThongKe> getThongKe(Date timeStart, Date timeEnd) {
        System.out.println(timeStart);
        System.out.println(timeEnd);
      

    
      
    ArrayList<ThongKe> kq = new ArrayList<ThongKe>();
    
try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT t1.MaLaptop,tenMay,Nhap,Xuat FROM(\n"
                    + "	SELECT MaLaptop, SUM(SoLuong) AS Nhap FROM chitietphieunhap \n"
                    + "	JOIN phieunhap ON phieunhap.MaPhieuNhap = chitietphieunhap.MaPhieuNhap\n"
                    + "	WHERE NgayNhap BETWEEN ? AND ?"
                    + "	GROUP BY chitietphieunhap\n"
                    + ") t1 \n"
                    + "JOIN(\n"
                    + "	SELECT MaLaptop, SUM(SoLuong) AS Xuat FROM chitietphieuxuat \n"
                    + "	JOIN phieuxuat ON phieuxuat.maPhieu = chitietphieuxuat.MaPhieuXuat \n"
                    + "	WHERE NgayXuat BETWEEN ? AND ?"
                    + "	GROUP BY MaLaptop\n"
                    + ") t2\n"
                    + "ON t1.MaLaptop = t2.MaLaptop\n"
                    + "JOIN laptop ON t1.MaLaptop = laptop.MaLaptop";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setTimestamp(1, new Timestamp(timeStart.getTime()));
            pst.setTimestamp(2, new Timestamp(timeEnd.getTime()));
            pst.setTimestamp(3, new Timestamp(timeStart.getTime()));
            pst.setTimestamp(4, new Timestamp(timeEnd.getTime()));

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MaLaptop = rs.getString("MaLaptop");
                String TenLaptop = rs.getString("TenLaptop");
                int Nhap = rs.getInt("Nhap");
                int Xuat = rs.getInt("Xuat");
                ThongKe t = new ThongKe(MaLaptop, TenLaptop, Nhap, Xuat);
                kq.add(t);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return kq;
    }

   
    }

