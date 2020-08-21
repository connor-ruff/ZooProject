public class Reptile extends Animal {

    // Properties
    boolean legs;
    boolean webbedFeet;



    // Methods
    // constructor
    // access
    // set
    // print
    public void printSubDetails() {
        // Legs
        if (legs) {
            System.out.println(name + " is a reptile with legs.");
        }
        else { 
            System.out.println(name + " is a reptile without legs.");
        }
        // Webbed Feet
        if (webbedFeet) {
            System.out.println(name + " is a reptile with webbed feet.");
        }
        else {
            System.out.println(name + " is a reptile without webbed feet.");
        }
    }

    // other
    public void needsExtHeat() { System.out.println("In order to survive, reptiles need an external heat source."); }

    public void cantSweat() { System.out.println("Reptiles can't sweat."); }
        

}
