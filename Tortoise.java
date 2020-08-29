public class Tortoise extends toothlessReptile {

    // Properties
    double shellThickness;
    int mateCount;


    // Methods
    // constructor
	public Tortoise(String name_in){
		super("Endangered",name_in,"Pool","Healthy", "Tortoise" , "Herbivore","This toirtoise has 10 kids and 3 wives" , true, true, true, "high");
		this.setshellThickness(1.5);
		this.setmateCount(10);
	}	
	
    // access
	public double getshellThickness(){
		return this.shellThickness;
	}
	
	public int getmateCount(){	
		return this.mateCount;
	}
	
    // set
	public void setshellThickness(double s){
		this.shellThickness = s;
	}
	
	public void setmateCount(int s){
		this.mateCount = s;
	}
	
	public void printSubDetails(){
		System.out.println( this.getName() + " has " + this.getshellThickness() + " inches");
		System.out.println( this.getName() + " has " + this.getmateCount() + " mates throughout its life." );
	}
	
	public void isShy(){
		System.out.println( this.getName() + " is super shy. Please be gentle" );

	}
	public void isFriendly(){
		System.out.println( this.getName() + " is very friendly, hence why he has so many kids");
	}
    //print sub details 
	
}
