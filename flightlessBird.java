public class flightlessBird extends Bird {

    // Properties
    String transportMethod;


    // Methods
    // constructor
    public flightlessBird(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, double wS_in, boolean sB_in, boolean wF_in, String bType_in, String trans_in) {
        super(cons_in, name_in, habitat_in, health_in, spec_in, diet_in, desc_in, wS_in, sB_in, wF_in, bType_in);
        this.transportMethod = trans_in;
    }

    // access
    String getTrans() { return this.transportMethod; }
    
    // set
    void setTrans(String trans_in) { this.transportMethod = trans_in; }
    
    // print
    public void printSubDetails() { System.out.println(name + " gets around by: " + transportMethod); }
    
    // others
    public void hasKeel() { System.out.println("Some flightless birds do not have their Keel bone as it is not being used for flight."); }

}
