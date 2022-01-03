package com.bl.chemistshop2;


public class Triphala extends Medicine {
	Triphala() {
		type = Medicine.Type.AYURVEDIC;
		companyName = "AYUR";
		composition = new String[3];
		composition[0] = "Amla(Indian Gooseberry)";
		composition[1] = "Bibhitaki(Terminalia bellirica)";
		composition[2] = "Haritaki(Terminalia chebula)";
		name ="Triphala";
	}

}