package ca.bcit.comp1451.assignment1.a00975687;

public class Address {
	private String streetNumber;
	private String streetName;
	private String cityName;
	private String postalCode;
	
	
	public Address(String streetNumber, String streetName, String cityName, String postalCode) {
		super();
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCityName(cityName);
		setPostalCode(postalCode);
		
	}


	public String getStreetNumber() {
		return streetNumber;
	}


	public String getStreetName() {
		return streetName;
	}


	public String getCityName() {
		return cityName;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setStreetNumber(String streetNumber) {
		if(streetNumber != null && !(streetNumber.isEmpty())){
			this.streetName = streetNumber.toUpperCase();
		}else{
			this.streetName = "unknown";
		}
		
	}


	public void setStreetName(String streetName) {
		if(streetName != null && !(streetName.isEmpty())){
			this.streetName = streetName.toUpperCase();
		}else{
			this.streetName = "unknown";
		}
		
	}


	public void setCityName(String cityName) {
		if(cityName != null && !(cityName.isEmpty())){
			this.cityName = cityName.toUpperCase();
		}else{
			this.cityName = "unknown";
		}
	}


	public void setPostalCode(String postalCode) {
		if(postalCode != null && !(postalCode.isEmpty())){
			this.postalCode = postalCode.toUpperCase();
		}else{
			this.postalCode = "unknown";
		}
	}
	
	
	
	
}
