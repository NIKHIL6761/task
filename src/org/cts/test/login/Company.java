package org.cts.test.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
	
	List<Integer> li=new LinkedList<>();
	
	li.addAll(l);
	li.add(300);
	li.add(100);
	li.add(500);
	System.out.println(li);
	li.retainAll(l);

	
	//li.removeAll(l);
	System.out.println(li);
	
	}
	}
	
	