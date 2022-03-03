package br.com.cdp.consumomarinetrafficapi.models.entities;

public class Vessel {

    private Long MMSI;
    private Long IMO;
    private String NAME;
    private String PLACE_OF_BUILD;
    private Long BUILD;
    private Double BREADTH_EXTREME;
    private Long SUMMER_DWT;
    private Long DISPLACEMENT_SUMMER;
    private String CALLSIGN;
    private String FLAG;
    private Double DRAUGHT;
    private Double LENGTH_OVERALL;
    private String FUEL_CONSUMPTION;
    private Double SPEED_MAX;
    private Double SPEED_SERVICE;
    private Long LIQUID_OIL;
    private String OWNER;
    private String MANAGER;
    private String FINANCIAL_OWNER;
    private String TECHNICAL_MANAGER;
    private String VESSEL_TYPE;

    public Vessel(){
    }

    public Vessel(Long MMSI, Long IMO, String NAME, String PLACE_OF_BUILD, Long BUILD, Double BREADTH_EXTREME, Long SUMMER_DWT, Long DISPLACEMENT_SUMMER, String CALLSIGN, String FLAG, Double DRAUGHT, Double LENGTH_OVERALL, String FUEL_CONSUMPTION, Double SPEED_MAX, Double SPEED_SERVICE, Long LIQUID_OIL, String OWNER, String MANAGER, String FINANCIAL_OWNER, String TECHNICAL_MANAGER, String VESSEL_TYPE) {
        this.MMSI = MMSI;
        this.IMO = IMO;
        this.NAME = NAME;
        this.PLACE_OF_BUILD = PLACE_OF_BUILD;
        this.BUILD = BUILD;
        this.BREADTH_EXTREME = BREADTH_EXTREME;
        this.SUMMER_DWT = SUMMER_DWT;
        this.DISPLACEMENT_SUMMER = DISPLACEMENT_SUMMER;
        this.CALLSIGN = CALLSIGN;
        this.FLAG = FLAG;
        this.DRAUGHT = DRAUGHT;
        this.LENGTH_OVERALL = LENGTH_OVERALL;
        this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
        this.SPEED_MAX = SPEED_MAX;
        this.SPEED_SERVICE = SPEED_SERVICE;
        this.LIQUID_OIL = LIQUID_OIL;
        this.OWNER = OWNER;
        this.MANAGER = MANAGER;
        this.FINANCIAL_OWNER = FINANCIAL_OWNER;
        this.TECHNICAL_MANAGER = TECHNICAL_MANAGER;
        this.VESSEL_TYPE = VESSEL_TYPE;
    }

    public Long getMMSI() {
        return MMSI;
    }

    public void setMMSI(Long MMSI) {
        this.MMSI = MMSI;
    }

    public Long getIMO() {
        return IMO;
    }

    public void setIMO(Long IMO) {
        this.IMO = IMO;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPLACE_OF_BUILD() {
        return PLACE_OF_BUILD;
    }

    public void setPLACE_OF_BUILD(String PLACE_OF_BUILD) {
        this.PLACE_OF_BUILD = PLACE_OF_BUILD;
    }

    public Long getBUILD() {
        return BUILD;
    }

    public void setBUILD(Long BUILD) {
        this.BUILD = BUILD;
    }

    public Double getBREADTH_EXTREME() {
        return BREADTH_EXTREME;
    }

    public void setBREADTH_EXTREME(Double BREADTH_EXTREME) {
        this.BREADTH_EXTREME = BREADTH_EXTREME;
    }

    public Long getSUMMER_DWT() {
        return SUMMER_DWT;
    }

    public void setSUMMER_DWT(Long SUMMER_DWT) {
        this.SUMMER_DWT = SUMMER_DWT;
    }

    public Long getDISPLACEMENT_SUMMER() {
        return DISPLACEMENT_SUMMER;
    }

    public void setDISPLACEMENT_SUMMER(Long DISPLACEMENT_SUMMER) {
        this.DISPLACEMENT_SUMMER = DISPLACEMENT_SUMMER;
    }

    public String getCALLSIGN() {
        return CALLSIGN;
    }

    public void setCALLSIGN(String CALLSIGN) {
        this.CALLSIGN = CALLSIGN;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public Double getDRAUGHT() {
        return DRAUGHT;
    }

    public void setDRAUGHT(Double DRAUGHT) {
        this.DRAUGHT = DRAUGHT;
    }

    public Double getLENGTH_OVERALL() {
        return LENGTH_OVERALL;
    }

    public void setLENGTH_OVERALL(Double LENGTH_OVERALL) {
        this.LENGTH_OVERALL = LENGTH_OVERALL;
    }

    public String getFUEL_CONSUMPTION() {
        return FUEL_CONSUMPTION;
    }

    public void setFUEL_CONSUMPTION(String FUEL_CONSUMPTION) {
        this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
    }

    public Double getSPEED_MAX() {
        return SPEED_MAX;
    }

    public void setSPEED_MAX(Double SPEED_MAX) {
        this.SPEED_MAX = SPEED_MAX;
    }

    public Double getSPEED_SERVICE() {
        return SPEED_SERVICE;
    }

    public void setSPEED_SERVICE(Double SPEED_SERVICE) {
        this.SPEED_SERVICE = SPEED_SERVICE;
    }

    public Long getLIQUID_OIL() {
        return LIQUID_OIL;
    }

    public void setLIQUID_OIL(Long LIQUID_OIL) {
        this.LIQUID_OIL = LIQUID_OIL;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER;
    }

    public String getMANAGER() {
        return MANAGER;
    }

    public void setMANAGER(String MANAGER) {
        this.MANAGER = MANAGER;
    }

    public String getFINANCIAL_OWNER() {
        return FINANCIAL_OWNER;
    }

    public void setFINANCIAL_OWNER(String FINANCIAL_OWNER) {
        this.FINANCIAL_OWNER = FINANCIAL_OWNER;
    }

    public String getTECHNICAL_MANAGER() {
        return TECHNICAL_MANAGER;
    }

    public void setTECHNICAL_MANAGER(String TECHNICAL_MANAGER) {
        this.TECHNICAL_MANAGER = TECHNICAL_MANAGER;
    }

    public String getVESSEL_TYPE() {
        return VESSEL_TYPE;
    }

    public void setVESSEL_TYPE(String VESSEL_TYPE) {
        this.VESSEL_TYPE = VESSEL_TYPE;
    }

    @Override
    public String toString() {
        return "Vessel{" +
                "MMSI=" + MMSI +
                ", IMO=" + IMO +
                ", NAME='" + NAME + '\'' +
                ", PLACE_OF_BUILD='" + PLACE_OF_BUILD + '\'' +
                ", BUILD=" + BUILD +
                ", BREADTH_EXTREME=" + BREADTH_EXTREME +
                ", SUMMER_DWT=" + SUMMER_DWT +
                ", DISPLACEMENT_SUMMER=" + DISPLACEMENT_SUMMER +
                ", CALLSIGN='" + CALLSIGN + '\'' +
                ", FLAG='" + FLAG + '\'' +
                ", DRAUGHT=" + DRAUGHT +
                ", LENGTH_OVERALL=" + LENGTH_OVERALL +
                ", FUEL_CONSUMPTION='" + FUEL_CONSUMPTION + '\'' +
                ", SPEED_MAX=" + SPEED_MAX +
                ", SPEED_SERVICE=" + SPEED_SERVICE +
                ", LIQUID_OIL=" + LIQUID_OIL +
                ", OWNER='" + OWNER + '\'' +
                ", MANAGER='" + MANAGER + '\'' +
                ", FINANCIAL_OWNER='" + FINANCIAL_OWNER + '\'' +
                ", TECHNICAL_MANAGER='" + TECHNICAL_MANAGER + '\'' +
                ", VESSEL_TYPE='" + VESSEL_TYPE + '\'' +
                '}';
    }
}
