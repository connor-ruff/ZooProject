public class toothlessReptile extends Reptile {

    // Properties
    boolean swallowWhole;
    String dangerLevel;


    // Methods
    // constructor
    // access
    // set
    // print
    public void printSubDetails() {
        // swallow whole
        if (swallowWhole) {
            System.out.println(name + " can swallow their food whole.");
        }
        else {
            System.out.println(name + " can't swallow their food whole.");
        }

        // danger level
        System.out.println(name + "'s danger level is: " + dangerLevel);
    }

    // other
    public void isLoner() { System.out.println("Most toothless reptiles live on their own."); }

}
