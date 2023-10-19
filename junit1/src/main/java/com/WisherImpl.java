package com;

public class WisherImpl implements Wisher {

	public String sayhi(String name) {
		// TODO Auto-generated method stub
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException();
			
		}
		return "Hello"+name;
	}

}
