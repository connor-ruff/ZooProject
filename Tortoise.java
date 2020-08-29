public class Tortoise extends toothlessReptile {

    // Properties
    double shellThickness;
    int mateCount;


    // Methods
    // Constructor
	public Tortoise(String name_in){
		super("Endangered",name_in,"Pool","Healthy", "Tortoise" , "Herbivore","This toirtoise has 10 kids and 3 wives." , true, true, true, "high");
		this.setshellThickness(1.5);
		this.setmateCount(10);
	}	
	
    // Get
	public double getshellThickness(){ return this.shellThickness; }
	public int getmateCount(){ return this.mateCount; }
	
    // Set
	public void setshellThickness(double s){ this.shellThickness = s; }
	
	public void setmateCount(int s){ this.mateCount = s; }
	
    // Print
	public void printSubDetails(){
		System.out.println( this.getName() + " has " + this.getshellThickness() + " inches.");
		System.out.println( this.getName() + " has " + this.getmateCount() + " mates throughout its life." );
	}
	
    // Other
	public void isShy(){
		System.out.println( this.getName() + " is super shy. Please be gentle." );

	}
	public void isFriendly(){
		System.out.println( this.getName() + " is very friendly, hence why he has so many kids.");
	}
	
}
