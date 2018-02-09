package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		// welcome message
		System.out.println("Welcome to BitBuddies Bed and Breakfast, a SoozaPoalooza Vitrual Pet Emporium(TM) corp.");

		// Default pet inventory:
		myShelter.addPet(new Cat("Tom", "Cat", 25, 25, 25, 25));
		myShelter.addPet(new Dog("Lassie", "Dog", 25, 25, 25, 25, 25));
		myShelter.addPet(new RoboticPet("R2-D2", "Robot", 25));
		myShelter.addPet(new RoboDog("RoboDog", "Robot Dog", 25, 25));
		
		// game loop
		String option = "";
		while (!option.equals("quit")) {
			// pets displayed
			System.out.println("Your Virtual Pet inventory:");
			System.out.println("--------------------------------------------------");
			myShelter.showPets();
			System.out.println();

			// game menu
			System.out.println("What would you like to do?");
			System.out.println("1) Feed all the pets.");
			System.out.println("2) Water all the pets.");
			System.out.println("3) Let out all the pets to go to the bathroom .");
			System.out.println("4) Playtime for all of the pets.");
			System.out.println("5) Walk all of the dogs.");
			System.out.println("6) Oil all robots.");
			System.out.println("7) Invite a new pet to BitBuddies Bed and Breakfast.");
			System.out.println("Or type 'quit' to exit game.");
			option = input.nextLine();

			if (option.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have chosen to feed all the pets.");
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
				System.out.println(
						"You have chosen to water all the pets. But now need to go to the bathroom has increased.");
			}
			if (option.equals("3")) {
				myShelter.letOutAllPets();
				System.out.println("You have chosen to let all the pets go to the bathroom.");
			}
			if (option.equals("4")) {
				myShelter.playWithAllPets();
				System.out.println("You have chosen to play with all the pets.");
			}
			if (option.equals("5")) {
				myShelter.walkAllDogs();
				System.out.println("You have chosen to walk all of the dogs.");
			}
			if (option.equals("6")) {
				myShelter.oilAllRoboticPets();
				System.out.println("You have chosen to oil all pets.)");
			}
			if (option.equals("7")) {
				System.out.println("Please enter the name of the pet you would like to add:");
				String petName = input.nextLine();
				System.out.println("Please enter a brief description of the pet you would like to admit:");
				String petDescription = input.nextLine();
				myShelter.addPet(new OrganicPet(petName, petDescription, 0, 0, 0, 0));
				System.out.println("You have added " + petName + " the " + petDescription + " to BitBuddies.");
			}
			if (option.equalsIgnoreCase("Quit")) {
				System.out.println("Goodbye!");
				input.close();
				System.exit(0);
			}
			myShelter.tickAllPets();
		}
	}
}
