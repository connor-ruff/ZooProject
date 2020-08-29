public class SnowLeopard extends Cat {

    // Properties
    float furThickness;


    // Methods
    // Constructor
	public SnowLeopard(String name_in){
		super("Endangered", name_in, "Snow Mountain", "Healthy", "Snow Leopard", "Carnivorous", "Likes personal space and chilling in a cave.", "Medium", 2, "White With Spots");
		this.furThickness = 4;
		}	

    // Get
	public float getfurThickness(){ return this.furThickness; }

    // Set
	public void setfurThickness(float furIn){ this.furThickness = furIn ; }

    // Print
	public void printSubDetails(){ System.out.println("Fur Thickness: " + this.furThickness); }

    // Other
	public void cantRoar(){ System.out.println("This little bud cannot roar :("); }
	public void isLoner(){ System.out.println("This little animal is a loner."); }
}
