public class Monkey extends Mammal {

    // Properties
    boolean tail;
    boolean bipedal;



    // Methods
    // constructor
    // access
    // set
    // print
    public void printSubDetails() {
        // tail
        if (tail) {
            System.out.println(name + " is a monkey with a tail.");
        }
        else {
            System.out.println(name + " is a monkey with no tail.");
        }

        // bipedal
        if (bipedal) {
            System.out.println(name + " is a bipedal monkey.");
        }
        else {
            System.out.println(name + " is not a bipedal monkey.");
        }
    }


    // other
    public void friendliness() { System.out.println(name + " is a friendly monkey."); }

    public void geneticDistHumans() { System.out.println("Monkeys are genetically close to humans."); }

}
