//driver file 
import java.util.Scanner;
import java.util.ArrayList;

public class zooDatabase{
	


	// make an empty animal array list that way u can add no matte what :P
	public static ArrayList<Animal> setupAnimals(ArrayList<Animal> alist){

		Monkey m1 = new Monkey("Joel");
		alist.add(m1);	
		SnowLeopard s1 = new SnowLeopard("Sunny");
		alist.add(s1);
		Alligator a1 = new Alligator("Ally");
		alist.add(a1);
		Tortoise t1 = new Tortoise("Speedy");
		alist.add(t1);
		Penguin pen1 = new Penguin("Rico");
		alist.add(pen1);
		Parrot par1 = new Parrot("Polly");
		alist.add(par1);
		Monkey m2 = new Monkey("Joelle");
		alist.add(m2);
		Tortoise t2 = new Tortoise("Slowy");
		alist.add(t2) ;

		printSummary(alist);
		System.out.println("");
		printVerbose(alist);
		return alist;
	}

	 
	//create function for the summary
	static void printSummary(ArrayList<Animal> alist){

		int [] counts = new int[6];

		System.out.println("Summary");
		for(Animal a : alist){  
			
			switch( a.getSpecies() ) {

				case "Snow Leopard":
					counts[0]++;
					break;
				case "Monkey":
					counts[1]++;
					break;
				case "Alligator":
					counts[2]++;
					break;
				case "Tortoise":
					counts[3]++;
					break;
				case "Penguin":
					counts[4]++;
					break;
				case "Parrot":
					counts[5]++;
					break;			
			}		
		}

		System.out.println("There are " + alist.size() + " animals in the zoo.");

		// then print out the nubers for each animal
		if ( counts[0] != 0 )
			System.out.println(counts[0] + " Snow Leopard(s)");
		if ( counts[1] != 0 )
			System.out.println(counts[1] + " Monkey(s)");
		if ( counts[2] != 0 )
			System.out.println(counts[2] + " Alligator(s)");
		if ( counts[3] != 0 )
			System.out.println(counts[3] + " Tortoise(s)");
		if ( counts[4] != 0 )
			System.out.println(counts[4] + " Penguin(s)");
		if ( counts[5] != 0 )
			System.out.println(counts[5] + " Parrot(s)");


	}	
	
	// create function for the verbose 
	static void printVerbose(ArrayList<Animal> alist){	
		
		System.out.println("Verbose List of Animals:");
		System.out.println("	Name		Species");
		for ( int i =0; i < alist.size(); ++i){
			System.out.println(i+1 + ":	" + alist.get(i).getName() + "		" + alist.get(i).getSpecies());

		}		
	}
	
	
	// adding 
	public static ArrayList<Animal> addAnimal(ArrayList<Animal> alist){
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("\nWhat Is The Animal's Species?");
		String species = sc.nextLine();
		System.out.println("\nWhat Is The Animal's Name?");
		String name = sc.nextLine();
		

		if(species.toLowerCase().equals( "monkey" )){
			Monkey m = new Monkey(name);
			alist.add(m);
		}
		else if(species.toLowerCase().equals("snow leopard")){
			SnowLeopard s = new SnowLeopard(name);
			alist.add(s);

		}
		else if(species.toLowerCase().equals("alligator")){
			Alligator a = new Alligator(name);
			alist.add(a);
		}
		else if(species.toLowerCase().equals("tortoise")){
			Tortoise tor = new Tortoise(name);
			alist.add(tor);
		}
		else if(species.toLowerCase().equals("penguin")){
			Penguin pen = new Penguin(name);
			alist.add(pen);
		}
		else if(species.toLowerCase().equals("parrot")){
			Parrot par = new Parrot(name);
			alist.add(par);
		}
		else{
			System.out.println("Animal species not recognized.");
		}
		 
		System.out.println("");
		return alist;
	}
	
	
	// deleting 
	public static ArrayList<Animal> deleteAnimal(ArrayList<Animal> alist){

		Scanner sc = new Scanner(System.in);
		printVerbose(alist);
		System.out.println("\nEnter the name of the animal to delete:");
		String name_in = sc.nextLine();

		boolean found = false;
		for (Animal a : alist ){
			if ( a.getName().toLowerCase().equals(name_in.toLowerCase()) ){
				found = true;
				alist.remove(a);
				break;
			}
		}

		if (!found){
			System.out.println(name_in + " does not exist at our zoo!");
		}

		System.out.println("");
		return alist;	
	}

	public static void displayAnimal(ArrayList<Animal> alist){

		Scanner sc = new Scanner(System.in);
		printVerbose(alist);
		System.out.println("\nEnter the name of the animal to display information about:");
		String name_in = sc.nextLine();

		boolean found = false;
		for (Animal a : alist ){
			if ( a.getName().toLowerCase().equals(name_in.toLowerCase()) ){

				System.out.println("\nInformation on " + a.getName());
				a.printGeneralDetails();
				a.printSubDetails();

				found = true;
				break;
			}
		}

		if (!found){
			System.out.println(name_in + " does not exist at the zoo!");
		}

		System.out.println("");
	}
	

	public static void main(String[] args){
		
		ArrayList<Animal> alist = new ArrayList<Animal>();
		alist = setupAnimals(alist);
	
		
		//while exit is not called 
		
		boolean exit = false;
		int opt;

		while( exit != true){
			// print options that can be given and then begin the switch case
			System.out.println("");	
			System.out.println("Options: ");
			System.out.println("1: Add an animal");
			System.out.println("2: Delete an animal");
			System.out.println("3: Display an animal");
			System.out.println("4: EXIT\n");
			System.out.println("Enter an option number (1-4): ");
	
			
			Scanner scan = new Scanner(System.in);
			opt = scan.nextInt();


			switch(opt){
				case 1:
					alist = addAnimal(alist);
					printSummary(alist);	
					break;

				case 2: 
					alist =	deleteAnimal(alist);
					printSummary(alist);	
					break;
				case 3: 
					displayAnimal(alist);
					printSummary(alist);	
					break;
				case 4:
					exit = true;
					break;
			}	
			
		}
	}
	
	

}
