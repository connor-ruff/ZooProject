public class Mammal extends Animal {

    // Properties
    String amtFur;
    int litterSize;



    // Methods
    // constructor
    // access
    // set

    // print
    public void printSubDetails() {
        System.out.println(name + " has " + " fur.");
        System.out.println("The " + species + "species can have up to " + litterSize + " children at one time.");
    }


    // other
    public void warmBlooded() {System.out.println(name + " is warm blooded."); }
    public void hasHair() {System.out.println(name + " is has hair because they are a mammal."); }

}
