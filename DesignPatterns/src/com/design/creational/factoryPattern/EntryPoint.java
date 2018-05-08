package com.design.creational.factoryPattern;

import java.util.Scanner;

public class EntryPoint {

	public static void main(String[] args) {
		IPLFactory iplFactory = new IPLFactory();
		Scanner sc = new Scanner(System.in);
		Boolean repeat;
		do {
			repeat = null;
			System.out.println("Select one of following team : ");
			System.out.println("1. CSK \n2. MI \n3. RCB");
			System.out.println("Your Option : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				IPL ipl = iplFactory.getCaptain("csk");
				ipl.captain();
				break;
				
			case 2:
				IPL ipl1 = iplFactory.getCaptain("mi");
				ipl1.captain();
				break;
				
			case 3:
				IPL ipl2 = iplFactory.getCaptain("rcb");
				ipl2.captain();
				break;

			default:
				System.out.println("INVALID CHOICE!");
				break;
			}
			System.out.println("Do you want to continue? (1.Yes  2.No) : ");
			Integer choice2 = sc.nextInt();
			
			if (choice2.intValue() == 1) {
				repeat = Boolean.TRUE;
			} else if (choice2.intValue() == 2) {
				repeat = Boolean.FALSE;
			} else {
				System.out.println("INVALID OPTION SELECTED!");
			}
			
		} while (repeat);

	}

}
