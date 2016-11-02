package ca.bcit.comp1451.quizz1.a00975687;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	private ArrayList<String> stringList;
	
	
	public Test(){
		stringList = new ArrayList<>();
		
		stringList.add("Hello");
		stringList.add("world");
	}
	
	public void displayString(){
		
		Iterator<String> it = stringList.iterator();	
		while(it.hasNext()){
			String s = it.next();
			
			System.out.println(s);
		}
		
	}
	
	public static void main(String[]args){
		
		
		
	}
	
	

}
