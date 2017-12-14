package com.smalcerz.TW05vol2.zadanieDomowe.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.smalcerz.TW05vol2.zadanieDomowe.helpers.Random;
import com.smalcerz.TW05vol2.zadanieDomowe.ludziki.Person;
import com.smalcerz.TW05vol2.zadanieDomowe.ludziki.Reader;
import com.smalcerz.TW05vol2.zadanieDomowe.ludziki.Writer;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		for(int i=0;i<10000;i++) {
			if(Random.getRandom(0, 100) > 95) {
				people.add(new Writer(i));
			}else {
				people.add(new Reader(i));
			}
		}
		//start tasks
				
		
		Iterator<Person> iPeople = people.iterator();
		while(iPeople.hasNext()) {
			iPeople.next().start();
		}
		
		
		
		
		
		//join threads
		try {
			
			Iterator<Person> iPeople2 = people.iterator();
			while(iPeople2.hasNext()) {
				
				iPeople2.next().join();
				
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
