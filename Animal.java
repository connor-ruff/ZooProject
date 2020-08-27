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
    // constructor
	public Animal(){
	}
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

    // access
    String getConsStat() { return conservationStat; }
    String getName() { return name; }
    int getAge() { return age; }
    String getHabitat() { return habitat; }
    String getHealthStat() { return healthStat; }
    String getSpecies() { return species; }
    String getDiet() { return diet; }
    String getDesc() { return desc; }

    // set
    void setConsStat(String cons_in) { conservationStat = cons_in; }
    void setAge(int age_in) { age = age_in; }
    void setHealthStat(String health_in) { healthStat = health_in; }
    void setDiet(String diet_in) { diet = diet_in; }
    void setDesc(String desc_in) { desc = desc_in; }
	void setName(String name_in) { this.name = name_in; }
	void setSpecies(String spec_in) { this.species = spec_in; }

    // prints
    public final void printDesc() {
        System.out.println(desc);
    }


    public final void printGeneralDetails() {
    
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Health Status: " + healthStat);
        System.out.println("Conservation Status: " + conservationStat);
    
    }


    public abstract void printSubDetails();


    // other
    public final void livesAtZoo() { System.out.println(name + " lives at the zoo!"); }

}
