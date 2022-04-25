/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Phuc Map
 */
public class dichvuControctor 
{
    private String id;
    private String tendv;
    private long giadv;
    private int trangthaidv;

    public dichvuControctor() 
    {
    }

    // hàm dịch vụ để quản lý
    public dichvuControctor(String Id, String Ten, long Gia) 
    {
        this.id = Id;
        this.tendv = Ten;
        this.giadv = Gia;
       
    }

    public int getNoService() 
    {
        return trangthaidv;
    }

    public void setNoService(int khongtrangthai) 
    {
        this.trangthaidv = khongtrangthai;
    }
    // hàm dịch vụ cho phiếu đặt phòng
    public dichvuControctor (String Id, String Ten, long Gia, int trangthai) 
    {
        this.id = Id;
        this.tendv = Ten;
        this.giadv = Gia;
        this.trangthaidv = trangthai;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getTendv() 
    {
        return tendv;
    }

    public void setTendv(String tendv) 
    {
        this.tendv = tendv;
    }

    public long getGiadv() 
    {
        return giadv;
    }

    public void setGiadv(long giadv) 
    {
        this.giadv = giadv;
    } 
}
