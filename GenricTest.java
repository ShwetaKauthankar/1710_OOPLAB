package oop;

import java.util.ArrayList;
import java.util.List;

public class GenricTest {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		List<Integer> integerList = new ArrayList<>();
		stringList.add("hello");
		stringList.add("bye");
		integerList.add(14);
		integerList.add(171);
		
		printList(stringList);
		printList(integerList);

	}
	static <E> void printList(List<E> myList) {
		Iterator<E> myItr = myList.iterator();
		while(myItr.hasNext()) {
			System.out.println(myItr.next() + "...");
		}
		System.out.println();
		
		
		
		/*
		for(E item : myList) {
			System.out.println("--->" + item);
		}
		*/
	}

}
