package sandwich;
import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

import javax.xml.soap.Node;

public class CollectionsDataStructure {

	LinkedList<String> list = new LinkedList<String>();// create a linkedList
	LinkedList<String> Stack = new LinkedList<String>();
	LinkedList<String> HashMap = new LinkedList<String>();

	
	
	public void add(String name)//add object
	{
		list.add(name);
	}
	
	public void remove(int num)//remove object
	{
		list.remove(num);
	}
	
		
	public void queuePeek()//peek linkedlist
	{
		list.peek();
		System.out.println(list.peek());

	}
	
	public void queueSize()//check the size of the list
	{
		list.size();
		System.out.println(list.size());
	}
	
	public void stackPush(String name)// stack push method
	{
		list.push(name);
	}
	public void stackPop()//stack pop method
	{
		list.pop();
		System.out.println(list.pop());
	}
	
	public void search(int index, String a)//search method in linkedlist
	{
		index = Collections.binarySearch(list, a);
		System.out.println(index);
	}
	
	public void sort()// sort method in linkedlist
	{
		Collections.sort(list, Collections.reverseOrder());
	}
	
	
	public void showInfo()//show information 
	{
		System.out.println(list);
	}
}

