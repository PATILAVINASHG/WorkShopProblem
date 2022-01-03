package com.bl.chemistshop;

import java.util.List;
import java.util.ArrayList;

public class MedicineStore {

	private List medicineList = new ArrayList();
	
	public List getmedicinelist() {
		return medicineList;
	}
	
	public void add (Medicine medicine) {
		medicineList.add(medicine);
	}

	public void remove(Chrocin  crocin) {
	medicineList.remove(crocin);
	}	
	
	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}
		
}

