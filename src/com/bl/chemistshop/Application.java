package com.bl.chemistshop;

import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Chrocin crocin = new Chrocin();
		crocin. mfgDate = new Date("28/06/2020");
		crocin.expDate = new Date("28/06/2050");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("25/06/2019");
		gluconD.expDate = new Date("27/06/2040");
		
		Acicol acicol =  new Acicol();
		acicol.mfgDate = new Date("29/06/2018");
		acicol.expDate = new Date("24/06/2035");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("25/06/2017");
		disprin.expDate = new Date("26/06/2055");
	
		Nutrumur nutrumur = new Nutrumur();
		nutrumur.mfgDate = new Date("20/06/2017");
		nutrumur.expDate = new Date("26/06/2055");
		
	
		MedicineStore medicinestore =new MedicineStore();
		
		medicinestore.add(crocin);
		medicinestore.add(disprin);
		medicinestore.add(gluconD);
		medicinestore.add(acicol);
		medicinestore.add(nutrumur);

		UserInterface userInterface =new UserInterface();
		userInterface.Print(medicinestore.getmedicinelist());
		//List medicineList = medicinestore.getmedicinelist();
		//userInterface.Print(medicineList);
		
		medicinestore.remove(crocin);
		medicinestore.remove(gluconD);
		
		System.out.println("Printing after removal: ");
		userInterface.Print(medicinestore.getmedicinelist());
	}
}
