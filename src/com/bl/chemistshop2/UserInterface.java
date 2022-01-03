package com.bl.chemistshop2;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	public void printAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.HOMEOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllAllopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.ALLOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllAyurvedic(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.AYURVEDIC) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllYunani(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.YUNANI) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	int showMainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number below to process :");
		System.out.println("Enter 1 to add medicine :");
		System.out.println("Enter 2 to remove medicine :");
		System.out.println("Enter 3 to update medicine :");
		System.out.println("Enter 4 to print all the medicine :");
	//	System.out.println("E
		System.out.println("Enter 5 to print all the Ayurvedic Medicine :");
		System.out.println("Enter 6 to print all the Unani Medicine :");
		System.out.println("Enter 7 to print all the Allopathy Medicine :");
		int option = scanner.nextInt();
		return option;
	}
	
	public void update(Medicine medicine) 
	{
		MedicineStore medicineStore = new MedicineStore();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Whiche Details You want to update (1-6)");
		System.out.println("[1] CompanyName \n [2] Type \n [3] MfgDate \n [4]ExpDate \n [5] Name \n [6] Composition");
		int op = scanner1.nextInt();
		
		switch (op) {
		case 1:
			
			System.out.println("Enter the updating Companyname");
			medicine.companyName = scanner1.next();
			break;
		case 2 :
			
			System.out.println("Enter the updating Type");
			//medicine.type = scanner1.next();
			break;
			
		case 3:
			System.out.println("Enter the updating Mfgdate dd/mm/yyyy");
			String date = scanner1.next();
			medicine.mfgDate = new Date(date);
			break;
			
		case 4:
			System.out.println("Enter the Updating Exp-date dd/mm/yyyy");
			String exdate = scanner1.next();
			medicine.expDate = new Date(exdate);
			break;
			
		case 5:
			System.out.println("Enter the medicine name");
			medicine.name = scanner1.next();
			break;
			
		case 6:
			System.out.println("Enter the composition");
			medicine.composition =  scanner1.nextLine().split(" ");
			break;
		default:
			System.out.println("Your medicine details is uptodate");
		}
	}
}