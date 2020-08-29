public class Reptile extends Animal {

    // Properties
    boolean legs;
    boolean webbedFeet;



    // Methods
    // Constructor
	public Reptile(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, boolean legs_in, boolean feet_in){
		super(cons_in, name_in, 0, habitat_in, health_in, spec_in, diet_in, desc_in); 
		this.legs = legs_in;
		this.webbedFeet = feet_in;
	}
    
    // Get
	public boolean getLegs(){ return this.legs; }
	public boolean getwebbedFeet(){ return this.webbedFeet; }

    // Set
	public void setlegs(boolean l){ this.legs = l; }
	public void setwebbedFeet(boolean w){ this.webbedFeet = w; }
    
    // Print
    public void printSubDetails() {
        // Legs
        if (legs) {
            System.out.println(this.getName() + " is a reptile with legs.");
        }
        else { 
            System.out.println(this.getName() + " is a reptile without legs.");
        }
        // Webbed Feet
        if (webbedFeet) {
            System.out.println(this.getName() + " is a reptile with webbed feet.");
        }
        else {
            System.out.println(this.getName() + " is a reptile without webbed feet.");
        }
    }

    // other
    public void needsExtHeat() { 
        System.out.println("In order to survive, reptiles need an external heat source."); 
    }

    public void cantSweat() { System.out.println("Reptiles can't sweat."); }
        

}
