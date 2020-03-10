package com.model.src;

public class MarkerInterfaceImpl implements Cloneable{
	
	int i;
	String s;
	
	public MarkerInterfaceImpl(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	protected Object clone() throws CloneNotSupportedException{ 
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		MarkerInterfaceImpl mi = new MarkerInterfaceImpl(20, "Geeks");
		MarkerInterfaceImpl mi1 = (MarkerInterfaceImpl) mi.clone();
		
		System.out.println(mi1.i);
		System.out.println(mi1.s);
	}

}
