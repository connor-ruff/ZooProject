public class Mammal extends Animal {

    // Properties
    String amtFur;
    int litterSize;



    // Methods
    // constructor
	public Mammal(){}
	
    // access
	public String getamtFur(){ return this.amtFur;	}

	public int getlitterSize(){   return this.litterSize; }

    // set
	public void setamtFur(String amtFurIn) {
		this.amtFur = amtFurIn;
	}

	public void setlitterSize(int litterIn){
		this.litterSize = litterIn;
	}
	

    // print
    public void printSubDetails() {
        System.out.println(this.getName() + " has " + " fur.");
        System.out.println("The " + this.getSpecies() + "species can have up to " + this.getlitterSize() + " children at one time.");
    }


    // other
    public void warmBlooded() {System.out.println(this.getName() + " is warm blooded."); }
    public void hasHair() {System.out.println(this.getName() + " is has hair because they are a mammal."); }

}
