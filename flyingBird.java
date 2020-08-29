public class flyingBird extends Bird {

    // Properties
    boolean migratory;
    boolean landOnGround;
    float flightSpeed;
    boolean clipped;


    // Methods
    // constructor
    public flyingBird(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, double wS_in, boolean sB_in, boolean wF_in, String bType_in, boolean mig_in, boolean ground_in, float flight_in, boolean clip_in) {
        super(cons_in, name_in, habitat_in, health_in, spec_in, diet_in, desc_in, wS_in, sB_in, wF_in, bType_in);
        this.migratory = mig_in;
        this.landOnGround = ground_in;
        this.flightSpeed = flight_in;
        this.clipped = clip_in;
    }

    // access
    boolean getMig() { return this.migratory; }
    boolean getGround() { return this.landOnGround; }
    float getSpeed() { return this.flightSpeed; }
    boolean getClipped() { return this.clipped; }


    // set
    void setMig(boolean mig_in) { this.migratory = mig_in; }
    void setGround(boolean ground_in) { this.landOnGround = ground_in; }
    void setSpeed(float flight_in) { this.flightSpeed = flight_in; }
    void setClipped(boolean clip_in) { this.clipped = clip_in; }
    


    // print
    public void printSubDetails() {
        // migratory
        if (migratory) {
            System.out.println(name + " is migratory.");
        }
        else {
            System.out.println(name + " is not migratory.");
        }

        // land on ground
        if (landOnGround) {
            System.out.println(name + " is a type of a bird that can land on the ground.");
        }
        else {
            System.out.println(name + " is a type of a bird that can't land on the ground.");
        }

        // flight speed
        System.out.println(name + "'s flight speed is: " + flightSpeed + " mph."); 
    }

    // others
    public void needsPerch() { System.out.println("A good habitat for a flying bird needs perches."); }

    public boolean wingsClipped() { return clipped; }

}
