/**
 * 
 */
package com.citylodge;

import java.util.Scanner;

import com.citylodge.implementations.RoomActionImplementation;
import com.citylodge.interfaces.RoomActionInterface;

/**
 * @author jaisri
 *
 */
public class CityLodgeMain {

	static RoomActionInterface roomAction;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int select;
		do {
			System.out.println("**** CITYLODGE MAIN MENU ****");
			System.out.println("Add Room: 1");
			System.out.println("Rent Room: 2");
			System.out.println("Return Room: 3");
			System.out.println("Room Maintancence: 4");
			System.out.println("Complete Maintanence: 5");
			System.out.println("Display Rooms: 6");
			System.out.println("Exit Program: 7");
			System.out.println("********************");
			System.out.println("Enter ur choice");

			Scanner scanner = new Scanner(System.in);
			select = scanner.nextInt();
			roomAction = new RoomActionImplementation();

			switch (select) {
			case 1:
				roomAction.addRoom();
				break;
			case 7: {
				System.out.println("You have selectedd option to exit.Do u wish to exit? Say Y/N");
				String input = scanner.next();
				if (input.equalsIgnoreCase("Y"))
					System.exit(0);
				else if(input.equalsIgnoreCase("N"))
					break;
			}

			}

		} while (select <=7);
		
	}

}
