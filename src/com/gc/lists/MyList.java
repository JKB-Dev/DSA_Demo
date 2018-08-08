package com.gc.lists;

public interface MyList {
	
	void removeAt (int index);
	
	void insertAt (int index, String data);

	void addAtBeginning (String data);
	
	void removeFromBeginning();
	
	void addAtEnd(String data);
	
	void removeFromEnd();
	
	String get(int index);
	
	int size();	// how many items are in the list
	
}
