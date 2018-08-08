package com.gc.lists;

public class ListApp {

	public static void main(String[] args) {
//		MyList list = new MyArrayList();
//		test(list);
		MyList list = new MyLinkedList();
		test(list);
	}
	
	private static void test(MyList list) {
		list.addAtBeginning("four");
		list.addAtBeginning("three");
		list.addAtBeginning("two");
		list.addAtBeginning("one");
		list.addAtBeginning("zero");
		//list.addAtEnd("six");		// code challenge
		list.insertAt(3, "five");
		
		//list.removeAt(0);
		System.out.println(list);
		
		//list.insertAt(13, "false");
		//list.addAtBeginning("one");
		
		//list.removeFromBeginning();
		
		//list.removeFromEnd();
		
		//System.out.println(list);
		//System.out.println(list.size());
	}
}
