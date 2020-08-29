public class Mammal extends Animal {

    // Properties
    String amtFur;
    int litterSize;



    // Methods
    // Constructor
	public Mammal(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, String af_in, int ls_in){
		super(cons_in, name_in, 0, habitat_in, health_in, spec_in, diet_in, desc_in);
		this.amtFur = af_in;
		this.litterSize = ls_in;
	}
	
    // Get
	public String getamtFur(){ return this.amtFur;	}

	public int getlitterSize(){ return this.litterSize; }

    // Set
	public void setamtFur(String amtFurIn) { this.amtFur = amtFurIn; }

	public void setlitterSize(int litterIn){ this.litterSize = litterIn; }
	

    // Print
    public void printSubDetails() {
        System.out.println(this.getName() + " has " + this.getamtFur() + " fur.");
        System.out.println("The " + this.getSpecies() + " species can have up to " + this.getlitterSize() + " children at one time.");
    }


    // Other
    public void warmBlooded() { System.out.println(this.getName() + " is warm blooded."); }
    public void hasHair() { System.out.println(this.getName() + " has hair because they are a mammal."); }

}
