package br.com.cdp.consumomarinetrafficapi.models.dao.impl;

import br.com.cdp.consumomarinetrafficapi.models.dao.VesselDao;
import br.com.cdp.consumomarinetrafficapi.models.db.DbException;
import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class VesselDaoJDBC implements VesselDao {

    private Connection conn;

    public VesselDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Vessel obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO vessel " +
                            "(mmsi, imo, name, place_of_build, build, breadth_extreme, summer_dwt, " +
                            "displacement_summer, callsign, flag, draught, length_overall, fuel_consumption, " +
                            "speed_max, speed_service, liquid_oil, owner, manager, financial_owner, technical_manager, vessel_type) " +
                            "VALUES " +
                            "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setLong(1, obj.getMMSI());
            st.setLong(2, obj.getIMO());
            st.setString(3, obj.getNAME());
            st.setString(4, obj.getPLACE_OF_BUILD());
            st.setNull(5, Types.INTEGER, obj.getBUILD().toString());
            st.setDouble(6, obj.getBREADTH_EXTREME());
            st.setLong(7, obj.getSUMMER_DWT());
            st.setLong(8, obj.getDISPLACEMENT_SUMMER());
            st.setString(9, obj.getCALLSIGN());
            st.setString(10, obj.getFLAG());
            st.setDouble(11, obj.getDRAUGHT());
            st.setDouble(12, obj.getLENGTH_OVERALL());
            st.setString(13, obj.getFUEL_CONSUMPTION());
            st.setDouble(14, obj.getSPEED_MAX());
            st.setDouble(15, obj.getSPEED_SERVICE());
            st.setLong(16, obj.getLIQUID_OIL());
            st.setString(17, obj.getOWNER());
            st.setString(18, obj.getMANAGER());
            st.setString(19, obj.getFINANCIAL_OWNER());
            st.setString(20, obj.getTECHNICAL_MANAGER());
            st.setString(21, obj.getVESSEL_TYPE());

            st.executeUpdate();

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public List<Vessel> findAll() {
        return null;
    }
}
