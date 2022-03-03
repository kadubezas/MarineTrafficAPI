package br.com.cdp.consumomarinetrafficapi.models.dao;

import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;

import java.util.List;

public interface VesselDao {

    void insert(Vessel obj);
    List<Vessel> findAll();
}
