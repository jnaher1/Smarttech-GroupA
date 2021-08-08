package com.groupstudy;

import java.util.StringJoiner;

public class JoiningString {

	public static void main(String[] args) {

		StringJoiner sjoiner =  new StringJoiner(""); // StringJoiner acts like adding two string by creating object.
		
		sjoiner.add("Smart Tech").add(" Group A").add(" Batch 15"); // .add() method are using for joining two string in StringJoiner class.
		System.out.println(sjoiner);
		
		

		
		
		
	}

}
