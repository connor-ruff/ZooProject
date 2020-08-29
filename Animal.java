public abstract class Animal {

    // Properties
    String conservationStat;
    String name;
    int age;
    String habitat;
    String healthStat;
    String species;
    String diet;
    String desc;


    // Methods
    // Constructor
    public Animal (String cons_in, String name_in, int age_in, String habitat_in, String health_in, String spec_in, String diet_in, String desc_in) {
    
        conservationStat = cons_in;
        name = name_in;
        age = age_in;
        habitat = habitat_in;
        healthStat = health_in;
        species = spec_in;
        diet = diet_in;
        desc = desc_in;    
    }

    // Get
    String getConsStat() { return conservationStat; }
    String getName() { return name; }
    int getAge() { return age; }
    String getHabitat() { return habitat; }
    String getHealthStat() { return healthStat; }
    String getSpecies() { return species; }
    String getDiet() { return diet; }
    String getDesc() { return desc; }

    // Set
    void setConsStat(String cons_in) { this.conservationStat = cons_in; }
    void setAge(int age_in) { this.age = age_in; }
    void setHealthStat(String health_in) { this.healthStat = health_in; }
    void setDiet(String diet_in) { this.diet = diet_in; }
    void setDesc(String desc_in) { this.desc = desc_in; }
	void setName(String name_in) { this.name = name_in; }
	void setSpecies(String spec_in) { this.species = spec_in; }

    // Print
    public final void printDesc() {
        System.out.println(this.desc);
    }


    public final void printGeneralDetails() {
    
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Age: " + this.age);
        System.out.println("Health Status: " + this.healthStat);
        System.out.println("Conservation Status: " + this.conservationStat);
    
    }


    public abstract void printSubDetails();


    // Other
    public final void livesAtZoo() { System.out.println(this.name + " lives at the zoo!"); }

}
