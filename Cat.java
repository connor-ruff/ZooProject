public class Cat extends Mammal {

    // Properties
    String colorPattern;



    // Methods
    // constructor
	
    // access
	public String getcolorPattern(){
		return this.colorPattern;
	}

    // set
	public void setcolorPattern(String colorIn){
		this.colorPattern = colorIn ;
	}

    // print
    public void printSubDetails() { System.out.println(name + " has " + colorPattern + " color pattern."); }

    // other
    public void isTerritorial() { System.out.println("Cats are generally very territorial."); }

    public void matesForLife() { System.out.println("Cats mate for life."); }

}
