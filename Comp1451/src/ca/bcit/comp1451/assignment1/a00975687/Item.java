package ca.bcit.comp1451.assignment1.a00975687;

public class Item {
	private double weightKg;
	private double manufacturingPriceDollars;
	private double suggestedReatailPriceDollars;
	private String uniqueID;
	
	public Item(double weightKg, double manufacturingPriceDollars, double suggestedReatailPriceDollars,
			String uniqueID) {
		super();
		setWeightKg(weightKg);
		setManufacturingPriceDollars(manufacturingPriceDollars);
		setSuggestedReatailPriceDollars(suggestedReatailPriceDollars);
		setUniqueID(uniqueID);
		
	}
	
	public double getWeightKg() {
		return weightKg;
	}
	
	public double getManufacturingPriceDollars() {
		return manufacturingPriceDollars;
	}
	
	public double getSuggestedReatailPriceDollars() {
		return suggestedReatailPriceDollars;
	}
	
	public String getUniqueID() {
		return uniqueID;
	}
	
	public void setWeightKg(double weightKg) {
		if(weightKg >=0 ){
			this.weightKg = weightKg;
		}else {
			this.weightKg = 0;
		}
	}
	
	public void setManufacturingPriceDollars(double manufacturingPriceDollars) {
		if(manufacturingPriceDollars >=0 ){
			this.manufacturingPriceDollars = manufacturingPriceDollars;
		}else {
			this.manufacturingPriceDollars = 0;
		}
	}
	
	public void setSuggestedReatailPriceDollars(double suggestedReatailPriceDollars) {
		if(suggestedReatailPriceDollars >=0 ){
			this.suggestedReatailPriceDollars = suggestedReatailPriceDollars;
		}else {
			this.suggestedReatailPriceDollars = 0;
		}
	}
	
	public void setUniqueID(String uniqueID) {
		if(uniqueID != null && !(uniqueID.isEmpty())){
			this.uniqueID = uniqueID;		
		}else{
			this.uniqueID = "unknown";
		}
	}
	
	
	
	
	
}
