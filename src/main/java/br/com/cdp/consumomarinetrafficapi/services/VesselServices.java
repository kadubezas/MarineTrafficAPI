package br.com.cdp.consumomarinetrafficapi.services;

import br.com.cdp.consumomarinetrafficapi.models.dao.DaoFactory;
import br.com.cdp.consumomarinetrafficapi.models.dao.VesselDao;
import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;

import java.sql.SQLException;

public class VesselServices {

    private VesselDao service = DaoFactory.createVesselDao();

    public void save(Vessel obj){
            service.insert(obj);
    }
}
