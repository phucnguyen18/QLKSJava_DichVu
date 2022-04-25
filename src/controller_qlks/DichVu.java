/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_qlks;

import java.util.ArrayList;
import model.dichvuQueRy;
import model.dichvuControctor;



/**
 *
 * @author Phuc Map
 */
public class DichVu {
    private dichvuQueRy service = new dichvuQueRy();
    private String idService;
    
    public ArrayList<dichvuControctor> getListDV() 
    {
        return service.getListServices();
    }

    public int getNumberDV() 
    {
        return service.getNumberService();
    }

    public ArrayList<dichvuControctor> searchDV(String key)
    {
        return service.searchService(key);
    }

    public boolean addDV(dichvuControctor dich_vu) 
    {
        return service.addDV(dich_vu);
    }

    public boolean updateDV(dichvuControctor dich_vu) 
    {
        return service.updateDV(dich_vu);
    }

    public boolean deleteDv(String idService) 
    {
        return service.deleteDV(idService);
    }
}
