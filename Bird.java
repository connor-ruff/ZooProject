public class Bird extends Animal {

    // Properties
    double wingSpan;
    boolean seaBird;
    boolean webbedFeet;
    String beakType;



    // Methods
    // constructor
    // access
    // set
    // print
    public void printSubDetails() {
        // wing span
        System.out.println(name + "'s wingspan is: " + wingSpan + " ft.");
        
        // sea bird?
        if (seaBird) {
            System.out.println(name + "is a sea bird.");
        }
        else {
            System.out.println(name + "isn't a sea bird.");
        }

        // webbedFeet
        if (webbedFeet) {
            System.out.println(name + "is a bird with webbed feet.");
        }
        else {
            System.out.println(name + "is a bird without webbed feet.");
        }
        // beak type
        System.out.println(name + "'s type of beak is: " + beakType + ".");
    }

    // other
    public void hasWings() { System.out.println("All birds have wings."); }
    
    public void hollowBones() { System.out.println("Many birds have hollow bones so that they are lighter for flying."); }

}
