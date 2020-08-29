public class Cat extends Mammal {

    // Properties
    String colorPattern;



    // Methods
    // Constructor
	public Cat(String cons_in, String name_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in, String af_in, int ls_in, String pat_in){
		super(cons_in, name_in, habitat_in, health_in, spec_in, diet_in, desc_in, af_in, ls_in);
		this.colorPattern = pat_in;
	}
	
    // Get
	public String getcolorPattern(){ return this.colorPattern; }

    // Set
	public void setcolorPattern(String colorIn){ this.colorPattern = colorIn ; }

    // Print
    public void printSubDetails() { 
        System.out.println(this.getName() + " has " + this.getcolorPattern() + " color pattern.");
    }

    // Other
    public void isTerritorial() { System.out.println("Cats are generally very territorial."); }

    public void matesForLife() { System.out.println("Cats mate for life."); }

}
