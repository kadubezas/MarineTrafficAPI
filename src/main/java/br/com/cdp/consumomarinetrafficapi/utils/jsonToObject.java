package br.com.cdp.consumomarinetrafficapi.utils;

import br.com.cdp.consumomarinetrafficapi.models.entities.Vessel;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class jsonToObject {

    public static Vessel transformJsonToObject(String key, String imo){
        Vessel vessel = new Vessel();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://services.marinetraffic.com/api/vesselmasterdata/v:4/"+key+"/imo:"+imo+"/protocol:jsono"))
                    .timeout(Duration.ofSeconds(5))
                    .build();

            HttpClient httpClient = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(5))
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject jsonObject = new JSONObject(response.body());
            JSONArray jsonArray = jsonObject.getJSONArray("DATA");
            JSONObject jsonVessel = jsonArray.getJSONObject(0);

            vessel.setMMSI((jsonVessel.getString("MMSI") == "")? null : jsonVessel.getLong("MMSI"));
            vessel.setIMO((jsonVessel.getString("IMO") == "") ? null : jsonVessel.getLong("IMO"));
            vessel.setNAME((jsonVessel.getString("NAME") == "")? null : jsonVessel.getString("NAME"));
            vessel.setPLACE_OF_BUILD((jsonVessel.getString("PLACE_OF_BUILD") == "")? null : jsonVessel.getString("PLACE_OF_BUILD"));
            vessel.setBUILD((jsonVessel.getString("BUILD") == "") ? null : jsonVessel.getLong("BUILD"));
            vessel.setBREADTH_EXTREME((jsonVessel.getString("BREADTH_EXTREME") == "") ? null : jsonVessel.getDouble("BREADTH_EXTREME"));
            vessel.setSUMMER_DWT((jsonVessel.getString("SUMMER_DWT") == "") ? null : jsonVessel.getLong("SUMMER_DWT"));
            vessel.setDISPLACEMENT_SUMMER((jsonVessel.getString("DISPLACEMENT_SUMMER") == "") ? null : jsonVessel.getLong("DISPLACEMENT_SUMMER"));
            vessel.setCALLSIGN((jsonVessel.getString("CALLSIGN") == "")? null : jsonVessel.getString("CALLSIGN"));
            vessel.setFLAG((jsonVessel.getString("FLAG") == "")? null : jsonVessel.getString("FLAG"));
            vessel.setDRAUGHT((jsonVessel.getString("DRAUGHT") == "") ? null : jsonVessel.getDouble("DRAUGHT"));
            vessel.setLENGTH_OVERALL((jsonVessel.getString("LENGTH_OVERALL") == "") ? null : jsonVessel.getDouble("LENGTH_OVERALL"));
            vessel.setFUEL_CONSUMPTION((jsonVessel.getString("FUEL_CONSUMPTION") == "")? null : jsonVessel.getString("FUEL_CONSUMPTION"));
            vessel.setSPEED_MAX((jsonVessel.getString("SPEED_MAX") == "") ? null : jsonVessel.getDouble("SPEED_MAX"));
            vessel.setSPEED_SERVICE((jsonVessel.getString("SPEED_SERVICE") == "") ? null : jsonVessel.getDouble("SPEED_SERVICE"));
            vessel.setLIQUID_OIL((jsonVessel.getString("LIQUID_OIL") == "") ? null : jsonVessel.getLong("LIQUID_OIL"));
            vessel.setOWNER((jsonVessel.getString("OWNER") == "")? null : jsonVessel.getString("OWNER"));
            vessel.setMANAGER((jsonVessel.getString("MANAGER") == "")? null : jsonVessel.getString("MANAGER"));
            vessel.setFINANCIAL_OWNER((jsonVessel.getString("FINANCIAL_OWNER") == "")? null : jsonVessel.getString("FINANCIAL_OWNER"));
            vessel.setTECHNICAL_MANAGER((jsonVessel.getString("TECHNICAL_MANAGER") == "")? null : jsonVessel.getString("TECHNICAL_MANAGER"));
            vessel.setVESSEL_TYPE((jsonVessel.getString("VESSEL_TYPE") == "")? null : jsonVessel.getString("VESSEL_TYPE"));

            return vessel;
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return vessel;
    }
}
