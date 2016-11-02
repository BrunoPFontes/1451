package ca.bcit.comp1451.lab3.a00975687;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Country {
	private HashMap<String, String> provincesMap;
	private String[][] provinces; 
	Scanner s;
	
	public Country(){
		
		provinces = new String[10][2];
		addData();
		provincesMap = new HashMap<String, String>();
		s = new Scanner(System.in);
		
		
	}
	
	public void addData(){
		
		provinces[0][0] = "ab";
		provinces[1][0] = "bc";
		provinces[2][0] = "mb";
		provinces[3][0] = "nb";
		provinces[4][0] = "nl";
		provinces[5][0] = "ns";
		provinces[6][0] = "on";
		provinces[7][0] = "pe";
		provinces[8][0] = "qc";
		provinces[9][0] = "sk";
		
		provinces[0][1] = "alberta";
		provinces[1][1] = "british columbia";
		provinces[2][1] = "manitoba";
		provinces[3][1] = "new brunswick";
		provinces[4][1] = "newfoundland";
		provinces[5][1] = "nova scotia";
		provinces[6][1] = "ontario";
		provinces[7][1] = "prince edward island";
		provinces[8][1] = "quebec";
		provinces[9][1] = "saskatchewan";
	}
	
	
	
	public void createHashMap(){
		
		
		for(int i = 0; i<provinces.length; i++){
			
				provincesMap.put(provinces[i][0], provinces[i][1]);
			
		}
	}
	
	public void showAllMappings(){
		Set<Map.Entry<String,String>>set = provincesMap.entrySet();
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " -> " + entry.getValue().substring(0, 1).toUpperCase() + entry.getValue().substring(1));
		}
	}
	
	public void showAllMappings2(){
		Set<String> keys = provincesMap.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			
			String province = provincesMap.get(key);
			
			System.out.println(key + " -> " + province.substring(0, 1).toUpperCase() + province.substring(1));
			
			
		}
	}
	
	public boolean doesAnyProvinceContain(){
		boolean result = false;
		
		System.out.println("Search for a substring: ");
		String search = s.next().toLowerCase();
		
		for(String s: provincesMap.values()){
			if(s.contains(search)){
				result = true;
				System.out.println("Province: " + s.substring(0, 1).toUpperCase() + s.substring(1));
			}else{
				
			}
			
		}
		
		return result;
		
	}
		
	
	
	
	
	
}
