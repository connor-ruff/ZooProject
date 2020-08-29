public class Parrot extends flyingBird {

    // Properties
    boolean identicalMate;
    boolean isTropical;
    int knownWords;


    // Methods
    // constructor
    public Parrot(String name_in) {
        super("Not Threatened", name_in, "Trees", "Healthy", "Parrot", "Herbivore", "He really wants a cracker.", 8.3, true, true, "Narrow", true, true, 15, false);
        this.identicalMate = true;
        this.isTropical = true;
        this.knownWords = 8;
    }

    // access
    boolean getMate() { return this.identicalMate; }
    boolean getTrop() { return this.isTropical; }
    int getWords() { return this.knownWords; }

    // set
    void setMate(boolean mate_in) { this.identicalMate = mate_in; }
    void setTrop(boolean trop_in) { this.isTropical = trop_in; }
    void setWords(int word_in) { this.knownWords = word_in; }

    // print
    public void printSubDetails() {
        System.out.println(this.getName() + " knows " + this.getWords() + " words.");

        if (identicalMate) {
            System.out.println(this.getName() + " has an idenitcal mate.");
        }
        if (isTropical) {
            System.out.println(this.getName() + " is a tropical parrot.");
        }
	}

}
