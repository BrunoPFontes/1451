package ca.bcit.comp1451.lesson5.a00975687;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class School  {
	
	private Person president; 
	
	
	private HashMap<String, Student> mapStudents;
	private HashMap<String, BCITStudent> mapBCITStudents;

	public School() {
		
		
		president = new Person("Kathy", "Kinloch",1960, false);
		
		mapStudents = new HashMap<String, Student>();
		mapBCITStudents = new HashMap<String, BCITStudent>();
		
		
		
		addData();
		
		
		
		
		
		
	}
	
	private void addData(){
		
		Student s = new Student("Mark ", "Zuckerberg", 1984, true, "12345678", "computer science", 7.1  );
		String key = s.getStudentNumber();
		mapStudents.put(key, s);
		
		Student s1 = new Student("Michelle", "Obama", 1964, false, "98765432", "law", 8.1  );		
		String key1 = s1.getStudentNumber();
		mapStudents.put(key1, s1);
		
		BCITStudent b1 = new BCITStudent("Markus", "Frind", 1979, true, "12345678", "computer science", 7.2, 1);
		String key2 = b1.getStudentNumber();
		mapBCITStudents.put(key2, b1);
		
		BCITStudent b2 = new BCITStudent("Gloria", "Macarenko", 1962, false, "88877777", "journalism", 7.2);
		String key3 = b2.getStudentNumber();
		mapBCITStudents.put(key3, b2);
	}
	
	
	public void getDetails(){
		Set<String> keys = mapStudents.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			
			System.out.println("Key -> " + key + "; Value -> " + mapStudents.get(key).printDetails());
			
		}
		
		
		Set<String> keysBCIT = mapBCITStudents.keySet();
		
		Iterator<String> itBCIT = keysBCIT.iterator();
		
		while(itBCIT.hasNext()){
			String keyBCIT = itBCIT.next();
			
			System.out.println("Key -> " + keyBCIT + "; Value -> " + mapBCITStudents.get(keyBCIT).printDetails());
			
		}
		
		
	
	}
	
	public void getDetails2(){
		Set<Map.Entry<String,Student>> set = mapStudents.entrySet();
		
		for(Map.Entry<String, Student> s: set){
			System.out.println(s.getKey() + "->" + s.getValue().printDetails());
		}
		
		Set<Map.Entry<String,BCITStudent>> setBCIT  = mapBCITStudents.entrySet();
		
		for(Map.Entry<String, BCITStudent> s: setBCIT ){
			System.out.println(s.getKey() + "->" + s.getValue().printDetails());
		}
		
		
		
	}
	
	public void getPresidentDetails(){
		System.out.println(president.getClass().getSimpleName() + ": " + president.getFirstName() +" " + president.getLastName()+ ",born " + president.getYearOfBirth() );
	}
	
	

	
	
}
