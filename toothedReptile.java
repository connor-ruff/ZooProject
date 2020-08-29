public class toothedReptile extends Reptile {

    // Properties
    String teethType;
    int teethCount;
    boolean friendly;


    // Methods
    // Constructor
	public toothedReptile(String cons_in, String name_in, String habitat_in, String health_in, String species, String diet_in , String desc_in,  boolean legs_in, boolean feet_in, String teethType_in , int teethCount_in , boolean friendly_in ){
		super(cons_in, name_in, habitat_in, health_in, species, diet_in, desc_in, legs_in, feet_in);
		this.teethType = teethType_in;
		this.teethCount = teethCount_in;
		this.friendly = friendly_in;
	}
    
    // Get
	public String getteethType(){ return this.teethType; }
	public int getteethCount(){ return this.teethCount; }
	public boolean getfriendly(){ return this.friendly; }
    
    // Set
	public void setteethType(String t){ this.teethType = t; }
	public void setteethCount(int t){ this.teethCount = t ; }
	public void setfriendly(boolean f){ this.friendly = f; }

    // print
    public void printSubDetails() {
        System.out.println(name + " has " + teethType + " teeth.");
        System.out.println(name + " has " + teethCount + " teeth.");
    }


    // others
    public void matesForLife() { System.out.println("Most toothed reptiles mate for life."); }

    public boolean isFriendly() { return friendly; }

}
