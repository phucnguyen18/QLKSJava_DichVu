/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.JDBCMSSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuc Map
 */
public class dichvuQueRy 
{
    private Connection conn;
    private ArrayList<dichvuControctor> dv = new ArrayList<>();
    private PreparedStatement stmt;

    public dichvuQueRy() 
    {
        conn = JDBCMSSQL.getConnection();
    }

    
    // Hàm lấy data từ database
    public ArrayList<dichvuControctor> getListServices() 
    {
        try 
        {
            stmt = conn.prepareStatement("SELECT * FROM dich_vu WHERE Trang_Thai = 1");
            dv.clear();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String idService = rs.getString(1);
                String nameService = rs.getString(2);
                long priceOfService = rs.getLong(3);
                dichvuControctor dich_vu = new dichvuControctor(idService, nameService, priceOfService);
                dv.add(dich_vu);

            }

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(dichvuQueRy.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dv;
    }

    public int getNumberService() 
    {
        int number = 0;
        try 
        {
            stmt = conn.prepareStatement("SELECT COUNT(*) FROM dich_vu WHERE Trang_Thai = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) 
            {
                number = rs.getInt(1);
            }
        } 
        catch (Exception e) 
        {
            
        }
        return number;
    }

    // Hàm tìm kiếm dịch vụ
    public ArrayList<dichvuControctor> searchService(String key) 
    {
        try 
        {
            dv.clear();
            stmt = conn.prepareStatement("SELECT * FROM dich_vu WHERE ID_DichVu LIKE '%" + key
                    + "%' OR Ten_Dich_Vu LIKE '%" + key + "%'" + "AND Trang_Thai = 1");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) 
            {
                String idService = rs.getString(1);
                String nameService = rs.getString(2);
                long priceOfService = rs.getLong(3);
                dichvuControctor dich_vu = new dichvuControctor(idService, nameService, priceOfService);
                dv.add(dich_vu);

            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(dichvuQueRy.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dv;
    }

    // Hàm thêm dịch vụ
    public boolean addDV(dichvuControctor dich_vu) 
    {
        boolean check = false;
        try 
        {
            stmt = conn.prepareStatement("INSERT INTO dich_vu(ID_DichVu, Ten_Dich_Vu, Don_Gia, Trang_Thai) VALUES(?,?,?,?)");
            stmt.setString(1, dich_vu.getId());
            stmt.setString(2, dich_vu.getTendv());
            stmt.setDouble(3, dich_vu.getGiadv());
            stmt.setInt(4, 1);
            int result = stmt.executeUpdate();
            check = result != 0;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(dichvuQueRy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    // Hàm sửa thông tin phòng
    public boolean updateDV(dichvuControctor dich_vu) 
    {
        boolean check = false;
        try 
        {
            stmt = conn.prepareStatement("UPDATE dich_vu SET Ten_Dich_Vu = ?, Don_Gia = ? WHERE ID_DichVu = ?");
            stmt.setString(1, dich_vu.getTendv());
            stmt.setDouble(2, dich_vu.getGiadv());
            stmt.setString(3, dich_vu.getId());
            int result = stmt.executeUpdate();
            check = result != 0;

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(dichvuQueRy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    // Hàm xóa dịch vụ
    public boolean deleteDV(String idService) 
    {
        boolean check = false;
        try 
        {
            stmt = conn.prepareStatement("DELETE FROM dich_vu WHERE ID_DichVU=?");
            stmt.setString(1, idService);
            int result = stmt.executeUpdate();
            check = result != 0;

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(dichvuQueRy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}
