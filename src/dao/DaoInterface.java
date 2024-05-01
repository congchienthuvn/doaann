/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author conimg1
 */
import java.util.ArrayList;
public interface DaoInterface<T>{
    public int insert (T t);
    public int update (T t);
    public int delete (T t);
    public ArrayList <T> SelectAll();
    public T search (String t );
    
}
