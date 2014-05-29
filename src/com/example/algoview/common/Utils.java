package com.example.algoview.common;

public class Utils {

	public static ArrayItem[] getArrayItems() {
		ArrayItem[] items = new ArrayItem[15];
		for (int i = 0; i < items.length; i++) {
			float rand = (float) Math.random() * 200;
			items[i] = new ArrayItem((int) rand, rand);
		}
		return items;
	}
}
