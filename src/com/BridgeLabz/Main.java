package com.BridgeLabz;

public class Main {

	public static void main(String[] args) {
	UnOrderedList<String> unOrderedList=new UnOrderedList<>();
	unOrderedList.add("189");
	unOrderedList.add("Number");
	unOrderedList.add("Batch");
	unOrderedList.add("Bridgelabz");
	unOrderedList.add("the");
	unOrderedList.add("to");
	unOrderedList.add("Welcome");
	unOrderedList.append("final");
	unOrderedList.remove("the");
	unOrderedList.removeAtLast();
	unOrderedList.search("to");
	unOrderedList.size();
	unOrderedList.index("Batch");
	unOrderedList.pop();
	unOrderedList.pop(2);
	unOrderedList.printList();

	}

}