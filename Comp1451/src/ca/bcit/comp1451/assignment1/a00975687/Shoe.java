package ca.bcit.comp1451.assignment1.a00975687;
import java.awt.Color;

public class Shoe extends Item {
	public final int DEFAULT_SHOES_SIZE = 8;
	
	Material material;
	private int size;
	Name designer;
	Color color;
	
	public Shoe(Material material, int size, Name designer, Color color, double weightKg, double manufacturingPriceDollars, double suggestedReatailPriceDollars, String uniqueID ) {
		super(weightKg, manufacturingPriceDollars, suggestedReatailPriceDollars, uniqueID);
		this.material = material;
		setSize(size);
		this.designer = designer;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if(size > 0 ){
			this.size = size;
		}else {
			this.size = DEFAULT_SHOES_SIZE;
		}
	}
	
	public void setDescription(String description){
		super.setUniqueID(description);
	}
	
	public String getDescription(){
		return super.getUniqueID();
	}
	
	
	
}
