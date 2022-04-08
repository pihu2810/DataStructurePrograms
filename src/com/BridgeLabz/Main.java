package com.BridgeLabz;

public class Main {

	public static void main(String[] args) {
	UnOrderedList<String> unOrderedList=new UnOrderedList<>();
	System.out.println("UnOrderedList");
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
	
	OrderedList<Integer> orderedList=new OrderedList<>();
	System.out.println("");
	System.out.println("OrderedList");
	orderedList.add(57);
	orderedList.add(89);
	orderedList.add(23);
	orderedList.add(97);
	orderedList.add(34);
	orderedList.add(12);
	orderedList.remove(57);
	orderedList.search(34);
	orderedList.size();
	orderedList.index(89);
	orderedList.pop();
	orderedList.pop(1);
	orderedList.printList();
	}

}