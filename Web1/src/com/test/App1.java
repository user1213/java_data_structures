package com.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class App1 {

	

	public static int[] removeDups(int[] x){
		return x;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String[] list = {"Amazon", "Facebook", "MSFT", "Google", "NetApp", "Dropbox", "Intel", "AirBnB"};
		
		Set<String> myList = new TreeSet<String>();
		for(String x: list){
			myList.add(x);
		}

		Vector<String> cList = new Vector<String>();
		Iterator it = myList.iterator();
		while(it.hasNext()){
			cList.add(it.next().toString());
		}
		
		System.out.println("Displaying elements: \n\n");
		Enumeration<String> en = cList.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
			System.out.println("\n");
			Thread.sleep(500);
		}


	}

}
