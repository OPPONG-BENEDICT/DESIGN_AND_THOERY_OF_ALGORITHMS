package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
		// write your here
		LinkedList<String> node = new LinkedList<String>();

		//Adding elements to the Linked list
		node.add("8");
		node.add("10");
		node.add("12");
		node.add("16");
		node.add("9");
		node.add("14");

		{
			System.out.println("THE LINKEDLIST IN THE BEGINNING IS: " + node +"\n");
		}
		//Adding an element to the first position
		node.addFirst("15");
		{
			System.out.println("THE LINKEDLIST AFTER ADDING 15 IS: " + node +"\n");
		}
		//Adding an element to the last position
		node.addLast("45");
		{
			System.out.println("THE LINKEDLIST AFTER ADDING 45 IS: " + node +"\n");
		}

		//Adding an element to the 5th position
		node.add(5, "25");
		{
			System.out.println("THE LINKEDLIST AFTER ADDING 25 IS: " + node +"\n");
		}

//Adding an element to the 3rd position
		node.add(3, "30");
		{
			System.out.println("THE LINKEDLIST AFTER ADDING NEW NODES IS: " + node + "\n");
		}



//remove an element from 7th position
		node.remove(7);
		{
			System.out.println("THE LINKEDLIST AFTER REMOVING 9 IS: " + node +"\n");
		}

//remove an element from 1st position
		node.remove(1);
		{
			System.out.println("THE LINKEDLIST AFTER REMOVING 8 IS: " + node +"\n");
		}

		     //Iterating LinkedList
		     Iterator<String> iterator=node.iterator();

		System.out.print("THE LINKEDLIST AFTER REMOVING OLD NODES IS : " );

		     while(iterator.hasNext())
		     {

		       System.out.print(iterator.next() + "\t");

			 }
    }
}



