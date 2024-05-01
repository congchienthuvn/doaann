/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Account;

/**
 *
 * @author cong1
 */
public class Search {
     public static Search getInstance() {
        return new Search();
    }

    public ArrayList<Account> searchAll(String text) {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> arr = AccountDAO.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getMaNguoiDung().toLowerCase().contains(text.toLowerCase())
                    || ncc.getTaiKhoan().toLowerCase().contains(text.toLowerCase())
                    || ncc.getPhamvitruycap().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchMa(String text) {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> arr = AccountDAO.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getMaNguoiDung().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchTaiKhoan(String text) {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> arr = AccountDAO.getInstance().SelectAll();
        for (var ncc : arr) {
            if (ncc.getTaiKhoan().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<Account> searchPhamvitruycap(String text) {
        ArrayList<Account> result = new ArrayList<>();
        ArrayList<Account> armt = AccountDAO.getInstance().SelectAll();
        for (var ncc : armt) {
            if (ncc.getPhamvitruycap().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
}
