package com.gc.lists;

import java.util.Arrays;

public class MyArrayList implements MyList {

	String[] array = new String[4];

	int length = 0;

	private boolean isFull() {
		return length == array.length;
	}

	private void doubleLength() {

		// make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}

		// Loop backwards and shift over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}

		// set first element and increment length
		array[0] = data;
		length++;

	}

	@Override
	public void removeFromBeginning() {
		array[0] = null;
		// for loop to make each index one less
		for (int i = 0; i < length - 1; i++) {
			array[i] = array[i + 1];
		}

		length--;
	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) { // if our array is out of space, double the size
			doubleLength();
		}
		// set the next item in the array and increment the length
		array[length] = data;
		length++;
	}

	@Override
	public void removeFromEnd() {
		array[length - 1] = null;
		length--;

	}

	@Override
	public String get(int index) {

		return array[index];
	}

	@Override
	public void insertAt(int index, String data) { // FIXME can't make boolean without changing MyList
		if (isFull()) {
			doubleLength();
		}
		// makes sure index is valid
		if (index >= 0 && index <= length) {
			for (int i = length; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = data;
			length++;

		} else {
			//return false;
		}

	}

	@Override
	public void removeAt(int index) {		// FIXME can't make boolean without changing MyList
		if (index >= 0 && index < length) {
			for (int i = index; i < length; i++) {
				array[i] = array[i + 1];
			}
			length--;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
