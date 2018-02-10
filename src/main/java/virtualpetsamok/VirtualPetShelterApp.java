package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		// welcome message
		System.out.println("Welcome to BitBuddies: Robo&Real, a SoozaPoalooza Vitrual Pet Emporium(TM) corp.");
		System.out.println("Some pets will be organic... some pets will be robotic!");

		// Default pet inventory:
		myShelter.addPet(new Cat("Tom", "Cat", 25, 25, 25, 25, 50));
		myShelter.addPet(new Dog("Lassie", "Dog", 25, 25, 25, 25, 25, 50));
		myShelter.addPet(new RoboCat("R2-D2", "Robot", 25));
		myShelter.addPet(new RoboDog("RoboDog", "Robot Dog", 25, 25));
		
		// game loop
		String option = "";
		while (!option.equals("quit")) {
			// pets displayed
			System.out.println();
			System.out.println("Your Virtual Pet inventory:");
			myShelter.showPets();
			System.out.println();

			// game menu
			System.out.println("What would you like to do?");
			System.out.println("1) Feed all the (organic) pets.");
			System.out.println("2) Water all the (organic) pets.");
			System.out.println("3) Let out all of the (organic) pets to go to the bathroom .");
			System.out.println("4) Playtime for all of the (organic) pets.");
			System.out.println("5) Walk all of the (robotic and organic) dogs.");
			System.out.println("6) Oil all robots.");
			System.out.println("7) Clean (organic) cats' litterbox.");
			System.out.println("8) Clean all (organic) dogs cages.");
			System.out.println("Or type 'quit' to exit game.");
			option = input.nextLine();
			System.out.println();
			
			if (option.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have chosen to feed all of the organic pets.");
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
				System.out.println(
						"You have chosen to water all of the organic pets. But now need to go to the bathroom has increased.");
			}
			if (option.equals("3")) {
				myShelter.letOutAllPets();
				System.out.println("You have chosen to let all of the organic pets go to the bathroom.");
			}
			if (option.equals("4")) {
				myShelter.playWithAllPets();
				System.out.println("You have chosen to play with all the pets.");
			}
			if (option.equals("5")) {
				myShelter.walkAllDogs();
				System.out.println("You have chosen to walk all of the organic and robotic dogs.");
			}
			if (option.equals("6")) {
				myShelter.oilAllRoboticPets();
				System.out.println("You have chosen to oil all of the robotic pets.)");
			}
			if (option.equals("7")) {
				myShelter.cleanCatLitterBox();
				System.out.println("You have cleaned the organic cats' litterbox.");
			}
			if (option.equals("8")) {
				myShelter.cleanAllDogsCages();
				System.out.println("You have cleaned the organic dog's cages.");
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
