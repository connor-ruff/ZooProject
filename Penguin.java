public class Penguin extends flightlessBird {

    // Properties
    float swimmingSpeed;
    float timeUnderwater;


    // Methods
    // constructor
    public Penguin(String name_in) {
        super("Not Threatened", name_in, "North Pole", "Healthy", "Penguin", "Fish", "She loves penguin sledding!", 6.2, true, true, "Narrow", "Swimming");
        this.swimmingSpeed = (float)15.3;
        this.timeUnderwater = (float)4.3;
    }
    
    // access
    float getSpeed() { return this.swimmingSpeed; }
    float getTime() { return this.timeUnderwater; }
    
    // set
    void setSpeed(float sp_in) { this.swimmingSpeed = sp_in; }
    void setTime(float tm_in) { this.timeUnderwater = tm_in; }


    // print
    public void printSubDetails() {
        System.out.println(this.getName() + " can swim up to " + this.swimmingSpeed + " mph.");
        System.out.println(this.getName() + " can stay underwater up to " + this.timeUnderwater + " minutes.");
	}
    
    // other
    public void carriesEgg() { 
        System.out.println("Penguins carry their eggs before they hatch.");
    }
    public void drinksSeaWater() { 
        System.out.println("Penguins can drink water from the sea.");
    }

}
