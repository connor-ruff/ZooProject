public class Alligator extends toothedReptile {

    // Properties
    String skinColor;
    String snoutShape;


    // Methods
    // constructor
	public Alligator(String name_in){

		super("Not Threatened", name_in, "Swamps", "Healthy", "Alligator", "Omnivorous", "This alligator loves laying in the sun ", true , false, "Sharp", 80, false);
		this.setskinColor("Green");
		this.setsnoutShape("Pointed");
	}
    // access
	public String getskinColor(){
		return this.skinColor;
	}
	public String getsnoutShape(){
		return this.snoutShape;
	}


    // set
	public void setskinColor(String s){
		this.skinColor = s;
	}
	public void setsnoutShape(String s){
		this.snoutShape = s;
	}

	public void printSubDetails(){
		System.out.println(this.getName() + " has " + this.getskinColor() + " skin.");
		System.out.println(this.getName() + " has a " + this.getsnoutShape() + " shaped snout.");
	}

	public void willBite(){
		System.out.println(this.getName() + " will bite! Watch out!");
	}

	public void isTerritorial(){
		System.out.println(this.getName() + " is fairly territorial around other Gators");
	}

}
