package com.example.algoview.common;

import android.graphics.Color;

public class ArrayItem {
	private int id;
	private Color color;
	private boolean isPivot;
	private float width;

	public ArrayItem(){
		isPivot = false;
	}
	
	public ArrayItem(int _id, float width){
		this();
		this.id = _id;
		this.width = width;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPivot() {
		return isPivot;
	}

	public void setPivot(boolean isPivot) {
		this.isPivot = isPivot;
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
}
