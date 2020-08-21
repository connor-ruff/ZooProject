public class toothedReptile extends Reptile {

    // Properties
    String teethType;
    int teethCount;
    boolean friendly;


    // Methods
    // constructor
    // access
    // set
    // print
    public void printSubDetails() {
        System.out.println(name + " has " + teethType + " teeth.");
        System.out.println(name + " has " + teethCount + " teeth.");
    }


    // others
    public void matesForLife() { System.out.println("Most toothed reptiles mate for life."); }

    public boolean isFriendly() { return friendly; }

}
