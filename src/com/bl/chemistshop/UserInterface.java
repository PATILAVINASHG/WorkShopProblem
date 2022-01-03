package com.bl.chemistshop;

import java.util.List;

public class UserInterface {
	
	public void printAllHomopathy(List<Medicine> list) {
		for (int i= 0; i<list.size(); i++) {
			if (list.get(i).type == Medicine.Type.HOMOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	public void Print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
	   }
	}
}
