package ca.bcit.comp1451.assignment1.a00975687;

import java.util.Collection;
import java.util.HashMap;

public class Store {
	Address streetAddress;
	private String name;
	HashMap<String, Item> itemsForSale;
	public Store(Address streetAddress, String name, HashMap<String, Item> itemMap) {
		super();
		this.streetAddress = streetAddress;
		this.name = name;
		this.itemsForSale = new HashMap<String, Item>();
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && !(name.isEmpty())){
			this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		}else{
			this.name = "unknown";
		}		
		
	}
	
	public void addItem(Item item){
		itemsForSale.put(item.getUniqueID(), item);
	}
	
	public Item getItemByKey(String key){
		return itemsForSale.get(key);
	}
	
	public Collection getCollectionOfItems(){
		return itemsForSale.values();
	}
	
	
	
	
	
	
	
	
}
