public class flyingBird extends Bird {

    // Properties
    boolean migratory;
    boolean landOnGround;
    float flightSpeed;
    boolean clipped;


    // Methods
    // constructor
    // access
    // set
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
        System.out.println(name + "'s flight speed is: " + flightSpeed); 
    }

    // others
    public void needsPerch() { System.out.println("A good habitat for a flying bird needs perches."); }

    public boolean wingsClipped() { return clipped; }

}
