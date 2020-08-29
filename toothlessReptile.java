public class toothlessReptile extends Reptile {

    // Properties
    boolean swallowWhole;
    String dangerLevel;


    // Methods
    // constructor
    public toothlessReptile(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, boolean legs_in, boolean feet_in, boolean swallowWhole_in, String dangerLevel_in){
		super(cons_in, name_in, habitat_in, health_in, spec_in, diet_in, desc_in, legs_in, feet_in);
		this.swallowWhole = swallowWhole_in; 
		this.dangerLevel = dangerLevel_in;
	}		

    // access
	public boolean getswallowWHole(){
		return this.swallowWhole;
	}
	
	public String getdangerLevel(){
		return this.dangerLevel;
	}
    // set
	public void setswallowWhole( boolean sw ){
		this.swallowWhole = sw;
	}

	public void setdangerLevel( String dl){
		this.dangerLevel = dl;
	}
    // print
	
    public void printSubDetails() {
        // swallow whole
        if (swallowWhole) {
            System.out.println(name + " can swallow their food whole.");
        }
        else {
            System.out.println(name + " can't swallow their food whole.");
        }

        // danger level
        System.out.println(name + "'s danger level is: " + dangerLevel);
    }

    // other
    public void isLoner() { System.out.println("Most toothless reptiles live on their own."); }

} 
