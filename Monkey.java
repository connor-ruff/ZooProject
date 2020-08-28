public class Monkey extends Mammal {

    // Properties
    boolean tail;
    boolean bipedal;



    // Methods
    // constructor
	public Monkey(String name_in){
		super("Not Threatened", name_in, "The Jungle", "Healthy", "Monkey", "Omnivores", "This monkey has lots of energy and loves practical jokes", "Light", 1);
		this.tail = true;
		this.bipedal = true;
	}

    // access
	public boolean getTail(){
		return this.tail;
	}
	public boolean getBipedal(){
		return this.bipedal;
	}

	// set
	public void setTail(boolean t){
		this.tail = t;
	}
	public void setBipedal(boolean b){
		this.bipedal = b;
	}
	
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
