package utils;

public enum Country {

	ESTADOS_UNIDOS("United States");
	
	private String country;
	
	Country(String country){
		this.country = country;
	}
	
	public String country() {
		return country;
	}
}
