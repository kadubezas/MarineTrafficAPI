package br.com.cdp.consumomarinetrafficapi.models.dao;

import br.com.cdp.consumomarinetrafficapi.models.dao.impl.VesselDaoJDBC;
import br.com.cdp.consumomarinetrafficapi.models.db.DB;

public class DaoFactory {

    public static VesselDao createVesselDao(){
        return new VesselDaoJDBC(DB.getConnection());
    }
}
