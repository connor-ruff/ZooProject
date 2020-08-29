public class Bird extends Animal {

    // Properties
    double wingSpan;
    boolean seaBird;
    boolean webbedFeet;
    String beakType;



    // Methods
    // constructor
    public Bird(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, double wS_in, boolean sB_in, boolean wF_in, String bType_in) {
        super(cons_in, name_in, 0, habitat_in, health_in, spec_in, diet_in, desc_in);
        this.wingSpan = wS_in;
        this.seaBird = sB_in;
        this.webbedFeet = wF_in;
        this.beakType = bType_in;
    }

    // access
    double getWingSpan() { return this.wingSpan; }
    boolean getSeaBird() { return this.seaBird; }
    boolean getWebbedFeet() { return this.webbedFeet; }
    String getBeakType() { return this.beakType; }

    // set
    void setWingSpan(double wS_in) { this.wingSpan = wS_in; }
    void setSeaBird(boolean sB_in) { this.seaBird = sB_in; }
    void setWebbedFeet(boolean wF_in) { this.webbedFeet = wF_in; }
    void setBeakType(String bT_in) { this.beakType = bT_in; }
    

    // print
    public void printSubDetails() {
        // wing span
        System.out.println(this.getName() + "'s wingspan is: " + wingSpan + " ft.");
        
        // sea bird?
        if (seaBird) {
            System.out.println(this.getName() + " is a sea bird.");
        }
        else {
            System.out.println(this.getName() + " isn't a sea bird.");
        }

        // webbedFeet
        if (webbedFeet) {
            System.out.println(this.getName() + " is a bird with webbed feet.");
        }
        else {
            System.out.println(this.getName() + " is a bird without webbed feet.");
        }
        
        // beak type
        System.out.println(this.getName() + "'s type of beak is: " + beakType + ".");
    }

    // other
    public void hasWings() { System.out.println("All birds have wings."); }
    
    public void hollowBones() { 
        System.out.println("Many birds have hollow bones so that they are lighter for flying."); 
    }

}
